package com.demo.aop.test;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 17:26
 **/
public class Proxy implements Subject
{
    private  RealSubject realSubject;
    public Proxy(RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }
    @Override
    public void request()
    {
        System.out.println("before...");
        try
        {
            realSubject.request();
        }catch (Exception e )
        {
            System.out.println("ex:"+e.getMessage());
            throw e;
        }finally
        {
            System.out.println("after...");
        }
    }

    @Override
    public void hello(String message)
    {
        System.out.println("123 before");
        realSubject.hello(message);
    }
}
