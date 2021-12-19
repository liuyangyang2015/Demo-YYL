package com.demo.juc;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author jack.l
 * @date 2021/8/20 10:03 上午
 * Description
 */
public class Demo {
    public void print(String content){
        System.out.println(content);
    }

    public static void print2(String content){
        System.out.println(content);
    }

    public void test(){
        List<String> list = Arrays.asList("aaa","bbb","ccc");
        list.forEach(this::print);
        list.forEach(new Demo()::print);
        list.forEach(Demo::print2);
    }



//    public static volatile int[] ints = new int[5];
    public static  int[] ints = new int[5];
    public static void main(String[] args) throws Exception {
        Object o = new Object();
        new Thread(() -> {
            //线程A
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ints[0] = 2;
        }).start();
        new Thread(() -> {            //线程B
            while (true) {
                if (ints[0] == 2) {
                    System.out.println("结束");
                    break;
                }
//                System.out.println("waiting");
            }
        }).start();
    }
}
