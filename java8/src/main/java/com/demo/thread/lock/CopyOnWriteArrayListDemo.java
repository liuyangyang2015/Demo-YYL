package com.demo.thread.lock;

/**
 * @author jack.l
 * @date 2021/12/24 6:01 下午
 * Description
 */

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**

 *     描述：     演示CopyOnWriteArrayList迭代期间可以修改集合的内容

 */

public     class     CopyOnWriteArrayListDemo     {

             

                            public     static     void     main(String[]     args)     {

             

                                                CopyOnWriteArrayList<Integer> list     =     new     CopyOnWriteArrayList<>(new     Integer[]{1,     2,     3});

             

                                                System.out.println(list);     //[1,     2,     3]

             

                                                //Get     iterator     1

                                                Iterator<Integer> itr1     =     list.iterator();

             

                                                //Add     one     element     and     verify     list     is     updated

                                                list.add(4);

             

                                                System.out.println(list);     //[1,     2,     3,     4]

             

                                                //Get     iterator     2

                                                Iterator<Integer>     itr2     =     list.iterator();

             

                                                System.out.println("====Verify     Iterator     1     content====");

             

                                                itr1.forEachRemaining(System.out::println);     //1,2,3

             

                                                System.out.println("====Verify     Iterator     2     content====");

             

                                                itr2.forEachRemaining(System.out::println);     //1,2,3,4

             

                            }

             

        }

