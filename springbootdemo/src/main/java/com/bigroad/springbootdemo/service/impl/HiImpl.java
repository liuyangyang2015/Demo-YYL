package com.bigroad.springbootdemo.service.impl;

import com.bigroad.springbootdemo.service.Hi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-07-03 16:26
 **/
@Service
public class HiImpl implements Hi
{
    private static final Logger logger = LoggerFactory.getLogger(HiImpl.class);

    @Override
    @Async
    public void say()
    {
        System.out.println("controller#async task started. Thread: " +Thread.currentThread().getName());
        logger.info("test demo1");
        System.out.println("hello world !");
        logger.info("test demo2");

    }
}
