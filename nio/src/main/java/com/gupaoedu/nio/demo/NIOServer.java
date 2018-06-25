package com.gupaoedu.nio.demo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-24 11:53
 **/
public class NIOServer
{
    private int port = 8080;
    private InetSocketAddress address = null;

    private  Selector selector;
    public  NIOServer(int port)
    {
        this.port = port;
        address = new InetSocketAddress(this.port);

        try
        {
            ServerSocketChannel server = ServerSocketChannel.open();
            server.bind(address);

            selector = Selector.open();
            server.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器 准备就绪，监听端口时："+ this.port);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void listen()
    {
        while(true)
        {
            try
            {
                int wait = this.selector.select();
                if(wait == 0)
                {
                    continue;
                }
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> i = keys.iterator();
                while(i.hasNext())
                {
                    SelectionKey key = i.next();
                    process(key);
                    i.remove();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    public  void process(SelectionKey key) throws IOException
    {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        if(key.isAcceptable())
        {
            ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
            try
            {
             SocketChannel client = serverSocketChannel.accept();
             client.configureBlocking(false);
             client.register(selector,SelectionKey.OP_READ);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }else if(key.isReadable())
        {
            SocketChannel socketChannel=(SocketChannel) key.channel();
            int len=socketChannel.read(buffer);
            if(len>0)
            {
                buffer.flip();
                String content = new String(buffer.array(),0,len);
                System.out.println(content);
                socketChannel.register(selector,SelectionKey.OP_WRITE);
            }
            buffer.clear();
            socketChannel.finishConnect();
        }else if(key.isWritable())
        {
            SocketChannel client =(SocketChannel) key.channel();
            client.write(ByteBuffer.wrap("hello world".getBytes()));
        }
    }
    public static void main(String[] args)
    {
        new NIOServer(8080).listen();
    }
}
