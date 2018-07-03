package com.bigroad.springbootdemo.service.imple;

import com.bigroad.springbootdemo.service.Hi;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-07-03 16:26
 **/
public class HiImpl implements Hi
{
    @Override
    @Async
    public void say()
    {
        System.out.println("hihi");
    }
}
