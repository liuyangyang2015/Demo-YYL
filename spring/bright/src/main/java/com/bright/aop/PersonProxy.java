package com.bright.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-03 10:24
 **/
public class PersonProxy implements InvocationHandler
{
    private Person target;

    public Object getInstance(Person person)
    {
        target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("start");
        method.invoke(this.target,args);
        System.out.println("end");
        return  null;
    }
}
