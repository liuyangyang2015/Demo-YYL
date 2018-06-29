package com.bigroad.springbootdemo.controller;

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
    @RequestMapping("/hi")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
