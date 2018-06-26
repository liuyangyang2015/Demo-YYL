package com.demo.aop.test;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 17:29
 **/
public class Client
{
    public static void main(String[] args)
    {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
