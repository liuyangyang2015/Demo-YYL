package com.demo.designPatterns.proxyPattern;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-25 15:45
 **/
public class HelloImpl implements Hello
{
    @Override
    public String dance(Integer name)
    {
        System.out.println(" I am dancing!");
        return name +" people are dancing!";
    }
}
