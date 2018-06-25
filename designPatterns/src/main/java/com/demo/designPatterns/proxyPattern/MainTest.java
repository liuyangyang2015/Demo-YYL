package com.demo.designPatterns.proxyPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-25 10:31
 **/
public class MainTest
{
    public static void main(String[] args)
    {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        InvocationHandler handler = new TestInvocationHandler(new LYYProxy());
        Hi proxy = (Hi) Proxy.newProxyInstance(handler.getClass().getClassLoader(), LYYProxy.class.getInterfaces(), handler);
        String name = proxy.sayHello("flower");
        System.out.println(name);

    }
}