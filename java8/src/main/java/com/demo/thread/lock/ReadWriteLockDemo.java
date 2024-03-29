package com.demo.thread.lock;

/**
 * @author jack.l
 * @date 2021/12/24 2:56 下午
 * Description
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**

 * 描述：     演示读写锁用法

 */

public class ReadWriteLockDemo {



    private static final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(

            false);

    private static final ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock

            .readLock();

    private static final ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock

            .writeLock();



    private static void read() {

        readLock.lock();

        try {

            System.out.println(Thread.currentThread().getName() + "得到读锁，正在读取");

            Thread.sleep(500);

        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {

            System.out.println(Thread.currentThread().getName() + "释放读锁");

            readLock.unlock();

        }

    }



    private static void write() {

        writeLock.lock();

        try {

            System.out.println(Thread.currentThread().getName() + "得到写锁，正在写入");

            Thread.sleep(500);

        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {

            System.out.println(Thread.currentThread().getName() + "释放写锁");

            writeLock.unlock();

        }

    }



    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> read()).start();

        new Thread(() -> read()).start();

        new Thread(() -> write()).start();

        new Thread(() -> write()).start();

    }

}
