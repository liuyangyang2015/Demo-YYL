package com.demo.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 19:02
 **/
public class DemoMethodIntercept implements MethodInterceptor
{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("before in cglib");
        Object object = null;
        try
        {
            object =methodProxy.invokeSuper(o,objects);
        }catch (Exception e)
        {
            System.out.println("get ex:"+e.getMessage());
            throw e;
        }finally
        {
            System.out.println("after in cglib");
        }
        return object;
    }
}
