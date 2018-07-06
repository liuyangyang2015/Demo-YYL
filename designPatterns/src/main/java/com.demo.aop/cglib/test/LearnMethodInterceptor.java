package com.demo.aop.cglib.test;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-07-06 15:42
 **/
public class LearnMethodInterceptor implements MethodInterceptor
{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("before learing ");
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("after learnign");
        return result;
    }
}
