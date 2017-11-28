package com.demo.socket;
import java.io.*;
import java.net.Socket;
/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-28 23:31
 **/
public class Client
{
    public static void main(String[] args) throws IOException
    {
        Socket socket =new Socket("localhost",8080);
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String info = null;
        while((info=br.readLine())!= null){
         System.out.println("我是客户端，服务器说："+info);
    }
    }
}
