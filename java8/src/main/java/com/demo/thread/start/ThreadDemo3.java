package com.demo.thread.start;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
 * 线程之间不相互影响
 */
public class ThreadDemo3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //提交任务，并用 Future提交返回结果
        Future<Integer> future = service.submit(new CallableTask());

        System.out.println(future.get());
    }

}

class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }

}