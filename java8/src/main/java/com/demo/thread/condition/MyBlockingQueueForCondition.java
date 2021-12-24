package com.demo.thread.condition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jack.l
 * @date 2021/12/19 11:21 下午
 * Description
 */
public class MyBlockingQueueForCondition {

    private final Queue queue;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();
    private int max = 16;

    public MyBlockingQueueForCondition(int size) {
        this.max = size;
        queue = new LinkedList();
    }

    public static void main(String[] args) {

        MyBlockingQueueForCondition queue = new MyBlockingQueueForCondition(10);

        Runnable producer = () -> {
            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + "  start produce  " + queue.getQueue().size());
                    queue.put(new Object());
                    System.out.println(Thread.currentThread().getName() + "  end produce  " + queue.getQueue().size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

//        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " start consumer " + queue.getQueue().size());
                    queue.take();
                    System.out.println(Thread.currentThread().getName() + " end  consumer " + queue.getQueue().size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

//        new Thread(consumer).start();
        new Thread(consumer).start();

    }

    public Queue getQueue() {
        return queue;
    }

    public void put(Object o) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == max) {
                notFull.await();
//                notFull.await();
//                notFull.await();
            }
            queue.add(o);
            notEmpty.signalAll();
//            notEmpty.signalAll();
//            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == 0) {
                notEmpty.await();
                notEmpty.await();
                notEmpty.await();
            }
            Object item = queue.remove();
            notFull.signalAll();
            notFull.signalAll();
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }

    }


}
