package com.demo.designPatterns.proxyPattern;

import lombok.Data;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-25 10:23
 **/
@Data
public class LYYProxy implements Hi
{
    private  String name ="tom";
    private Integer  age = 18;

    @Override
    public  String sayHello(String name)
    {
        System.out.println("hi,"+name);
        return name;
    }


}
