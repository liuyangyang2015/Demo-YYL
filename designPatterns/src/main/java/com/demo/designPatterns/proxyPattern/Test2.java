package com.demo.designPatterns.proxyPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-25 15:49
 **/
public class Test2
{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        InvocationHandler handler = new TestInvocationHandler(new HelloImpl());

        Class proxy3 = Proxy.getProxyClass(Hello.class.getClassLoader(), new Class[]{Hello.class});
        Constructor constructor = proxy3.getConstructor(InvocationHandler.class);
        Hello proxy2 = (Hello) constructor.newInstance(handler);
        String str = proxy2.dance(10);
        System.out.println(str);
    }
}
