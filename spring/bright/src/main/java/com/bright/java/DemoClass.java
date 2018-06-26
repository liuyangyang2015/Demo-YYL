package com.bright.java;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-28 9:45
 **/
public class DemoClass
{
    private static String str = "静态变量";
    private static Integer num;
    private String name = "bright";
    private Integer count;

    static
    {
        System.out.println("初始化静态代码");
    }

    {
        System.out.println("初始化代码块");
    }

    public DemoClass()
    {
        System.out.println("构造器执行！");
    }

    public static void main(String[] args)
    {
        System.out.println("main");
        DemoClass demoClass = new DemoClass();
        PrivateConstructor privateConstructor=PrivateConstructor.getPrivateConstructor();
    }
}
