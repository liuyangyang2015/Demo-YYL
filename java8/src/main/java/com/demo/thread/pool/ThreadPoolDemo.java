package com.demo.thread.pool;

/**
 * @author jack.l
 * @date 2021/12/21 9:10 下午
 * Description
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述：     用固定线程数的线程池执行10000个任务
 */

public class ThreadPoolDemo {
    static AtomicInteger a = new AtomicInteger(0);

    public static void main(String[] args) {

        ExecutorService service = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 100; i++) {
            try {
                service.execute(new Task());
            }catch (Exception e){
                System.out.println(a.get() + " "+Thread.currentThread().getName()+" "+ e);
            }


        }

//        Thread currentThread = Thread.currentThread();
//        System.out.println(
//                (currentThread.getThreadGroup().getParent() == null ? null : currentThread.getThreadGroup().getParent().getName()) + " || "
//
//                        + currentThread.getThreadGroup().getName() + "  "
//                        + currentThread.getThreadGroup().isDaemon() + "  "
//                        + currentThread.getThreadGroup().isDestroyed() + " || "
//
//                        + currentThread.getId() + " " + currentThread.getName() + "  "
//                        + currentThread.isDaemon() + "  "
//                        + currentThread.isAlive() + "  " + currentThread.getState() + "  " + currentThread.getPriority()+" ... main ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            System.out.println(a.incrementAndGet()+"  "+
                    (currentThread.getThreadGroup().getParent() == null ? null : currentThread.getThreadGroup().getParent().getName()) + " || "

                            + currentThread.getThreadGroup().getName() + "  "
                            + currentThread.getThreadGroup().isDaemon() + "  "
                            + currentThread.getThreadGroup().isDestroyed() + " || "

                            + currentThread.getId() + " " + currentThread.getName() + "  "
                            + currentThread.isDaemon() + "  "
                            + currentThread.isAlive() + "  " + currentThread.getState() + "  " + currentThread.getPriority()
            );

        }

    }

}
