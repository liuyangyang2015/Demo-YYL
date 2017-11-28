package com.demo.aop.cglib;

import com.demo.aop.test.RealSubject;
import com.demo.aop.test.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 19:07
 **/
public class Client
{
    public static void main(String[] args)
    {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoMethodIntercept());

        Subject subject= (Subject) enhancer.create();
        subject.hello("ai ren");
    }
}
