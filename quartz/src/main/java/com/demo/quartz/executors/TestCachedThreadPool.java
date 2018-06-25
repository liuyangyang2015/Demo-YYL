package com.demo.quartz.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-14 17:16
 **/
public class TestCachedThreadPool
{
    public static void main(String[] args) throws InterruptedException
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
//      ExecutorService executorService = Executors.newFixedThreadPool(5);
//      ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++){
            executorService.execute(new TestRunnable());
            Thread.sleep(5);
            System.out.println("************* a" + i + " *************");
        }
        executorService.shutdown();
    }
}

class TestRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "线程被调用了。");
    }
}
