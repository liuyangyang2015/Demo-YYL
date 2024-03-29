package com.demo.thread.safe;

/**
 * @author jack.l
 * @date 2021/12/20 9:36 下午
 * Description
 */
public class WrongResult {


    volatile static int i;


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

        thread1.start();

        Thread thread2 = new Thread(r);

        thread2.start();

        thread1.join();

        thread2.join();

        System.out.println(i);

    }

}
