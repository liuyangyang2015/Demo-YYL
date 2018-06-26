package com.demo.aop;

import com.demo.aop.test.RealSubject;
import com.demo.aop.test.Subject;

import java.lang.reflect.Proxy;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 17:37
 **/
public class Client
{
    public static void main(String[] args)
    {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.request();
        subject.hello("liuyangyang");
    }
}
