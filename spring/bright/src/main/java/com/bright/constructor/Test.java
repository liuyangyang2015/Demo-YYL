package com.bright.constructor;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-22 15:36
 **/
public class Test
{
    public static int a=10;
    public int b=20;

    public Test()
    {
        System.out.println("hiTwe");
    }
    {
        b=30;
    }

    public static void main(String[] args)
    {
        new Test2();
        new Demo();
        new Test();
    }
}
class Test2
{
    public static int a=10;
    public int b=20;
    static {
        a=20;
    }
    public Test2()
    {
        System.out.println("hi");
    }
    {
        b=40;
    }
}
class  Demo
{
    public static String name="124";
    public String   c ="blloi";
    public Demo()
    {
        System.out.println("hihi");
    }
    {
        c="40";
    }
}
