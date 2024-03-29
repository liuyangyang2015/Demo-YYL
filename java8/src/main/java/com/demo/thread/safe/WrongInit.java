package com.demo.thread.safe;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jack.l
 * @date 2021/12/20 9:49 下午
 * Description
 */
public class WrongInit {


    private Map<Integer, String> students;


    public WrongInit() {

        new Thread(new Runnable() {

            @Override

            public void run() {

                students = new HashMap<>();

                students.put(1, "王小美");

                students.put(2, "钱二宝");

                students.put(3, "周三");

                students.put(4, "赵四");
                System.out.println("1111");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }).start();

    }

    public static void main(String[] args) throws InterruptedException {

        WrongInit multiThreadsError6 = new WrongInit();

        System.out.println(multiThreadsError6.getStudents().get(1));


    }

    public Map<Integer, String> getStudents() {

        return students;

    }

}
