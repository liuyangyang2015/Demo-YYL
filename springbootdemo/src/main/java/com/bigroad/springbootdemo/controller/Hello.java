package com.bigroad.springbootdemo.controller;

import com.bigroad.springbootdemo.service.Hi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-29 17:59
 **/
@Controller
public class Hello {
    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    @Autowired
    private Hi hi;

    @RequestMapping(value = {"/hi", "/api/hi"})
    @ResponseBody
    @Async
    String home() {
        logger.error("controller");
        hi.say();//@Async  注解
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hihi");
            }
        }).start();
        System.out.println("home. Thread: " +Thread.currentThread().getName());
        return "Hello World!";
    }

    @RequestMapping("/")
    @ResponseBody
    public Callable<String> handleTestRequest() {

        System.out.println("controller#handler called. Thread: " + Thread.currentThread().getName());

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("controller#async task started. Thread:123 " + Thread.currentThread()
                                .getName());
                Thread.sleep(300);
                System.out.println(Thread.currentThread().getName() + "controller#async task finished456");
                return "async result";
            }
        };

        System.out.println(Thread.currentThread().getName() + "controller#handler finished");
        return callable;
    }
}
