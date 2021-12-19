package com.demo.thread.status;

/**
 * @author jack.l
 * @date 2021/12/19 5:01 下午
 * Description
 */
public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
        Runnable2 r2 = new Runnable2();
        Thread t = new Thread(r2);
        System.out.println("1 "+t.getState());

        t.start();
        System.out.println("2 "+t.getState());

        Thread.sleep(1*1000);
        System.out.println("3 "+t.getState());
        while(true){
            System.out.println("4 "+t.getState());
            Thread.sleep(1*100);
        }

//        synchronized(r2){
//            r2.notify();
//            System.out.println("4 "+t.getState());
//            Thread.sleep(100);
//            System.out.println("5 "+t.getState());
//        }
//        Thread.sleep(4000);
//        System.out.println("6 "+t.getState());
//        Thread.sleep(6*1000);
//        System.out.println("7 "+t.getState());
    }
}
class Runnable2 implements Runnable {

    @Override
    public void run() {
        synchronized (this){
            System.out.println("sub1 "+Thread.currentThread().getState());
            try {
                this.wait(2*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("sub2 "+Thread.currentThread().getState());
//            try {
//                Thread.sleep(6*1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            while(true){

            }
        }
    }
}