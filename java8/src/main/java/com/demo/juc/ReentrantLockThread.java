package com.demo.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jack.l
 * @date 2021/8/24 10:54 上午
 * Description
 */
public class ReentrantLockThread implements Runnable{

    // 创建一个ReentrantLock对象
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try{
            lock.lock();
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "输出了：  " + i);
            }
        }finally{
            lock.unlock();
        }

    }

}
