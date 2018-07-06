package com.demo.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-07-06 13:39
 **/
public class CGPrroxyDemo implements MethodInterceptor
{
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz)
    {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("before proxy");
        Object result = methodProxy.invokeSuper(o,objects);
//        Object result2 = methodProxy.invoke(o,objects);
        System.out.println("after proxy");
        return result;
    }
}
