package com.bright.util;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-26 16:17
 **/
public class TimeTest
{
    public static void main(String[] args) throws InterruptedException
    {
        long startTime=System.currentTimeMillis();
        Thread.sleep(1000);
        long endTime=System.currentTimeMillis();
        System.out.println("花费时间： "+(float)(endTime-startTime)/1000+"s");
    }
}
