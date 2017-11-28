package com.demo.aop.test;

import javax.sound.midi.Soundbank;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-25 17:24
 **/
public class RealSubject implements Subject
{
    @Override
    public void request()
    {
        System.out.println("real subject execute request...");
    }

    @Override
    public void hello(String message)
    {
        System.out.println("hello "+ message);
    }
}
