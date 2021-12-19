package com.demo.thread.start;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author jack.l
 * @date 2021/12/18 10:24 下午
 * Description
 * <p>
 * Thread    (runnable)   extend Thread
 * 本质上只有一种实现线程的方式
 * new Thread(runnable) Runnable
 * extends Thread
 * ThreadGroup
 * DefaultThreadFactory
 * <p>
 * Callable
 * 线程之间不相互影响 共享容器
 */
public class ThreadDemo1 {

    public static void main(String[] args) throws InterruptedException {
        RunnableTest test = new RunnableTest();
        List<String> queue = new ArrayList<String>();
        queue.add("test");
        test.setQueue(queue);
        Thread t1 = new Thread(test);
        //Thread.currentThread().setDaemon(true);
        //t1.setDaemon(true);
        t1.start();
//        t1.run();

        System.out.println("init...");
        Thread currentThread = Thread.currentThread();
        System.out.println(
                currentThread.getThreadGroup().getParent() == null ? null : currentThread.getThreadGroup().getParent().getName() + " || "

                        + currentThread.getThreadGroup().getName() + "  "
                        + currentThread.getThreadGroup().isDaemon() + "  "
                        + currentThread.getThreadGroup().isDestroyed() + " || "

                        + currentThread.getId() + " " + currentThread.getName() + "  "
                        + currentThread.isDaemon() + "  "
                        + currentThread.isAlive() + "  " + currentThread.getState() + "  " + currentThread.getPriority()
        );

        Thread.sleep(5000);
        System.out.println("exception...");
        for (String v : queue) {
            System.out.println(v);
        }
    }

}

class RunnableTest implements Runnable {

    private List queue;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // int a = 10/0;
        System.out.println("start sleep...");
        try {
            Thread.sleep(1000);
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
                        + currentThread.isAlive() + "  " + currentThread.getState() + "  " + currentThread.getPriority()
        );
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread t : threadSet) {
//            System.out.println(
//                    (t.getThreadGroup().getParent() == null ? null + "  " : t.getThreadGroup().getParent().getName()) + " || "
//
//                            + t.getThreadGroup().getName() + "  "
//                            + t.getThreadGroup().isDaemon() + "  "
//                            + t.getThreadGroup().isDestroyed() + " || "
//
//                            + t.getId() + " " + t.getName() + "  "
//                            + t.isDaemon() + "  "
//                            + t.isAlive() + "  " + t.getState() + "  " + t.getPriority()
//            );
            queue.add(t.getName());
        }
    }

    public List getQueue() {
        return queue;
    }

    public void setQueue(List queue) {
        this.queue = queue;
    }
}
