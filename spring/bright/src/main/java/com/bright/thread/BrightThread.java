package com.bright.thread;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-27 14:56
 **/
public class BrightThread
{
    private CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException
    {
        String str = "1,2,3,4,5,6,7,8,9";
        String[] source = str.split(",");
        System.out.println(Arrays.asList(source));

        Thread get = new Thread();

        Thread del = new Thread();

        get.join();
        del.join();

    }
}
