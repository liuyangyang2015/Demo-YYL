package com.demo.thread.jmm;

/**
 * @author jack.l
 * @date 2021/12/25 11:49 上午
 * Description
 */

/**
 * 描述：     演示可见性带来的问题
 */

public class VisibilityProblem {


   volatile int a = 10;

    volatile  int b = 20;


    private void change() {

        a = 30;

        b = a;

    }


    private void print() {

        System.out.println("b=" + b + ";a=" + a);
//        System.out.println(ClassLayout.parseInstance(t).toPrintable());

    }


    public static void main(String[] args) {

        while (true) {

            VisibilityProblem problem = new VisibilityProblem();

            new Thread(new Runnable() {

                @Override

                public void run() {

                    try {

                        Thread.sleep(1);

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    problem.change();

                }

            }).start();


            new Thread(new Runnable() {

                @Override

                public void run() {

                    try {

                        Thread.sleep(1);

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    problem.print();

                }

            }).start();

        }

    }

}
