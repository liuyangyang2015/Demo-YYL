package com.demo.thread.lock;

/**
 * @author jack.l
 * @date 2021/12/24 12:07 下午
 * Description
 */
public class SynTest {
    public SynTest() {
    }

    public void synBlock() {
        synchronized(this) {
            System.out.println("lagou");
        }
    }

    public synchronized void synBlock2() {
            System.out.println("lagou");
    }
}
