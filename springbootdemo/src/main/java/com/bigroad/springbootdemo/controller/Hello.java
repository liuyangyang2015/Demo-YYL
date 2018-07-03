package com.bigroad.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-29 17:59
 **/
@Controller
public class Hello
{
    private static final Logger logger = LoggerFactory.getLogger(Hello.class);
    @RequestMapping(value ={"/hi","/api/hi"})
    @ResponseBody
    String home() {
//        System.out.println("test");
        logger.error("controller");
        return "Hello World!";
    }
}
