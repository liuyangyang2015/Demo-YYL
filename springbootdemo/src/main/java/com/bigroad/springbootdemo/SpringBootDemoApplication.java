package com.bigroad.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class SpringBootDemoApplication extends SpringBootServletInitializer
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
