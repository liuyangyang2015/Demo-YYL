package com.demo.aop.cglib.test;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-07-06 15:42
 **/
public class ClientDemo
{
    public static void main(String[] args)
    {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "D:\\Repositories\\applicationDemo\\applicationDemos\\designPatterns\\src\\main\\java\\com\\demo\\designPatterns\\proxyPattern\\cglib");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(LearnDemo.class);
        enhancer.setCallback(new LearnMethodInterceptor());
        LearnDemo learnDemo= (LearnDemo) enhancer.create();
        learnDemo.learning("yuwen");
    }
}
