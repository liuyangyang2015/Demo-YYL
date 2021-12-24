package com.demo.thread.safe;

/**
 * @author jack.l
 * @date 2021/12/20 10:15 下午
 * Description
 */

/**
 * 描述：          共享的变量或资源带来的线程安全问题
 */

public class ThreadNotSafe1 {


    static int i;


    public static void main(String[] args) throws InterruptedException {

        Runnable r = new Runnable() {

            @Override

            public void run() {

                for (int j = 0; j < 10000; j++) {

                    i++;

                }

            }

        };

        Thread thread1 = new Thread(r);

        Thread thread2 = new Thread(r);

        thread1.start();

        thread2.start();

        thread1.join();

        thread2.join();

        System.out.println(i);

    }

}

