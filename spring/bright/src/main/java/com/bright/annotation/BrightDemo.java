package com.bright.annotation;

import java.lang.annotation.Annotation;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-28 16:55
 **/
@Bright
public class BrightDemo
{
    private String name = "bright demo";

    public static void main(String[] args)
    {
        BrightDemo bright = new BrightDemo();
        if(BrightDemo.class.isAnnotationPresent(Bright.class))
        {
            System.out.println("Bright annotation is effective!");
        }
        Annotation annotation = BrightDemo.class.getAnnotation(Bright.class);
//        annotation.
        String value= annotation.toString();
        System.out.println(value);

    }
}
