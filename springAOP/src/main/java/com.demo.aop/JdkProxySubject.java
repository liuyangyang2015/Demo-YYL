package com.demo.aop;

import com.demo.aop.test.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 16:55
 **/
public class JdkProxySubject implements InvocationHandler
{
    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before ...");
        Object object = null;
        try
        {
            object = method.invoke(realSubject,args);
        } catch (Exception e)
        {
            System.out.println("ex :"+e.getMessage());
            throw e;
        }finally
        {
            System.out.println("after ====");
        }
        return  object;
    }
}
