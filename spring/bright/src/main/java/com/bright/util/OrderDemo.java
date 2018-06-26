package com.bright.util;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-26 16:10
 **/
public class OrderDemo
{
    public  static String  desc="this is order check , to ensure i am ritht!";//111111111111111
    static  {
        System.out.println("22222222222222222222222222222");
        System.out.println("this is a order demo is executing static {} code ");
    }

    public String  name = "OrderDemo";//555555555555555
    {
        System.out.println("66666666666666666666");
        System.out.println("executing a {} code!");
    }

    public OrderDemo()
    {
        System.out.println(" 77777777777777777777777777");
        System.out.println(" this is parent constructor!");
    }
}
