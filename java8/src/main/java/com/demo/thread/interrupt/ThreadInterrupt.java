package com.demo.thread.interrupt;

/**
 * @author jack.l
 * @date 2021/12/19 5:05 下午
 * Description
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        // 任务1
        Runnable1 runnable1 = new Runnable1();

        // 线程1 设置线程
        Thread thread1 = new Thread(runnable1);

        // 启动线程
        thread1.start();


        Thread.sleep(3 * 1000);

        // 中断线程
        thread1.interrupt();

        Thread.sleep(60 * 1000);
    }
}

class Runnable1 implements Runnable {

    @Override
    public void run() {
        // 线程标志
        String threadNo = "Thread ID: " + Thread.currentThread().getId() + " | Thread Name: " + Thread.currentThread().getName();

        System.out.println("sub thread " + threadNo + " start...");

        while(!Thread.currentThread().isInterrupted()){
//            try {
//                Thread.sleep(1000);
                System.out.println("Thread ID: " + Thread.currentThread().getId() +" "+Thread.currentThread().isInterrupted());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                Thread.currentThread().interrupt();
//            }
        }

        System.out.println("sub thread " + threadNo + " end...");
    }
}
