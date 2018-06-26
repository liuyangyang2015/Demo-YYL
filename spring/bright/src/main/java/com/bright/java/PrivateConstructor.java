package com.bright.java;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-28 10:10
 **/
public class PrivateConstructor
{
    private static PrivateConstructor privateConstructor = new PrivateConstructor();
    public static int count1;
    public static int count2 = 0;
    private PrivateConstructor()
    {
        System.out.println("私有构造器启动！");
        System.out.println(count1+"  : "+count2);
        count1++;
        count2++;
        System.out.println(count1+"  : "+count2);
    }

    public static PrivateConstructor getPrivateConstructor()
    {
        System.out.println("返回单例！");
        return privateConstructor;
    }
}
