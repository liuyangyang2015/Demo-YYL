package com.bright.aop;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-03 10:24
 **/
public class Person
{
    private String name;

    public void  say()
    {
        System.out.println(name);
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
