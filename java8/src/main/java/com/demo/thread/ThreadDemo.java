package com.demo.thread;

import java.util.Set;

/**
 * @author jack.l
 * @date 2021/12/18 10:24 下午
 * Description
 * <p>
 * Thread    (runnable)   extend Thread
 * 本质上只有一种实现线程的方式
 */
public class ThreadDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            System.out.println("start sleep...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end sleep...");

            Thread currentThread = Thread.currentThread();
            System.out.println(
                    currentThread.getThreadGroup().getParent() == null ? null : currentThread.getThreadGroup().getParent().getName() + " || "

                            + currentThread.getThreadGroup().getName() + "  "
                            + currentThread.getThreadGroup().isDaemon() + "  "
                            + currentThread.getThreadGroup().isDestroyed() + " || "

                            + currentThread.getId() + " " + currentThread.getName() + "  "
                            + currentThread.isDaemon() + "  "
                            + currentThread.isAlive()+ "  "+currentThread.getState()
            );
            Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
            for (Thread t : threadSet
            ) {
                System.out.println(
                        (t.getThreadGroup().getParent() == null ? null+"  " : t.getThreadGroup().getParent().getName())+ " || "

                                + t.getThreadGroup().getName() + "  "
                                + t.getThreadGroup().isDaemon() + "  "
                                + t.getThreadGroup().isDestroyed() + " || "

                                + t.getId() + " " + t.getName() + "  "
                                + t.isDaemon() + "  "
                                + t.isAlive()+ "  " +t.getState()+ "  " +t.getPriority()
                );
            }
        });
        //Thread.currentThread().setDaemon(true);
        t1.setDaemon(true);
        t1.start();

        System.out.println("init...");
        Thread currentThread = Thread.currentThread();
        System.out.println(
                currentThread.getThreadGroup().getParent() == null ? null : currentThread.getThreadGroup().getParent().getName() + " || "

                        + currentThread.getThreadGroup().getName() + "  "
                        + currentThread.getThreadGroup().isDaemon() + "  "
                        + currentThread.getThreadGroup().isDestroyed() + " || "

                        + currentThread.getId() + " " + currentThread.getName() + "  "
                        + currentThread.isDaemon() + "  "
                        + currentThread.isAlive()+ "  " +currentThread.getState()+ "  " +currentThread.getPriority()
        );


    }

}
