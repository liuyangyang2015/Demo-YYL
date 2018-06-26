package com.bright.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liuyangyang
 * @create 2018-04-26 12:24 AM
 **/
public class BrightServer
{
    private static final int port = 8080;

    private static void test()
    {
        int a = 10 / 0;
    }

    private static void say()
    {
        test();
    }

    public void myFirstMethod() throws Exception
    {
        //Since it's an exception, I have to declare
        //it in the throws clause
        throw new Exception();
    }
    public void myFirstMethod1()
    {
        //Since it's an exception, I have to declare
        //it in the throws clause
        try
        {
            throw new Exception();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void myFirstMethod2()
    {
        //Since it's an exception, I have to declare
        //it in the throws clause
        throw new RuntimeException();
    }

    public void mySecondMethod()
    {
        //Because errors aren't supposed to occur, you
        //don't have to declare them.
        throw new Error();
    }

    public static void main(String[] args) throws IOException, InterruptedException //,Exception
    {

        System.out.println("BrightServer is starting up ...");
        ServerSocket server = new ServerSocket(port);

        while (true)
        {
            System.out.println("BrightServer is waiting to accept request ...");
            Socket socket = server.accept();//socket.bind(new A);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //socket inputstream 不消费 将获取不到通道 错误的观念
            System.out.println("the lines of request is ");
            String str = input.readLine();
            while (str != null && !str.isEmpty())
            {
                System.out.println(str);
                str = input.readLine();
            }
            System.out.println("Bright is going to send response !");
            PrintStream out = new PrintStream(socket.getOutputStream());
            String resp = "HTTP/1.1 200 OK\n" +
                    "Date: Fri, 22 May 2009 06:07:21 GMT\n" +
                    "Content-Type: text/html; charset=UTF-8\n" +
                    "\n" +
                    "<html>\n" +
                    "      <head><title>BrightServer</title></head>\n" +
                    "      <body>\n" +
                    "            Hi,I am BrightServer!\n" +
                    "      </body>\n" +
                    "</html>";
            String resp1 = "HTTP/1.1 200 OK " +
                    "Date: Sat, 31 Dec 2005 23:59:59 GMT " +
                    "Content-Type: text/html;charset=ISO-8859-1 " +
                    "Content-Length: 122 " +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>Wrox Homepage</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "Hi, BrightServer!\n" +
                    "</body>\n" +
                    "</html>";
//            Thread.sleep(8000);
            out.println(resp);
//            Thread.sleep(8000);
            out.close();
            input.close();
            try
            {
                say();
//                throw new Exception();
//               int a= 10/0;
            } catch (Throwable t)
            {
                System.out.println(t);
                try
                {
//                    throw new Exception("error", t);
                } catch (Exception e)
                {
                    e.printStackTrace();
                    System.out.println(e);
                    try
                    {
                        System.out.println("==================");
                        System.out.println("==================");
//                        throw new RuntimeException("错误", e);
                    } catch (Exception e1)
                    {
                        e1.printStackTrace();
//                        throw new Error();
//                        throw  new NullPointerException();
//                        throw new Exception();
                    }
                }

            }
        }
    }
}
