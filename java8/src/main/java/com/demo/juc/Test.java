package com.demo.juc;

import com.alibaba.fastjson.JSONObject;

import java.sql.SQLException;
import java.util.Stack;

/**
 * @author jack.l
 * @date 2021/7/20 5:04 下午
 * Description
 */




public class Test {


//    1 2  3  4 5

    public static void main(String[] args) throws SQLException {
        FirstReentrantLock lock = new FirstReentrantLock();
        lock.unwrap(lock.getClass());
        System.out.println(new ReentrantLockThread().getClass());

        String[] triggerTimeList1 = new String[] {};
        for (String triggerTime : triggerTimeList1) {
            Integer pendingTIme = Integer.valueOf(triggerTime);
        }

        System.out.println("".toLowerCase());

        JSONObject.parseObject("{\"ios\":\"2.36.1\",\"android\":\"2.36.1\"}").getString("".toLowerCase());
        Node node = new Node(1);
       node.next = new Node(2);
       node.next = new Node(3);
       node.next = new Node(4);
       node.next = new Node(5);
       convert(node,2);
    }

    public  static  void  convert(Node node,int k){
        Stack stack = new Stack();

        while (node != null) {
            Node[] array = new Node[k];
            for (int i = 0; i < k; i++) {
                if (node != null) {
                    array[i] = node;
                }
                if(node == null ){
                    break;
                }
                node = node.next;
            }
            stack.push(array);
        }
        Node head = null;
        Node tail = null;
        while (!stack.isEmpty())
        {
            Node[] array = (Node[])stack.pop();
            if(array.length>0){
                for(Node n : array){
                    if(head == null ){
                        head = n;
                    }
                    if(tail != null){
                        tail.next = n;
                    }
                    tail = n;
                }
            }
        }

    }






}

class Node{
    int v;
    Node next;

    public Node(int v) {
        this.v = v;
    }
}