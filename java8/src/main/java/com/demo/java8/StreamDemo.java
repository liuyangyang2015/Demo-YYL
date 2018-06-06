package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-31 16:37
 **/
public class StreamDemo
{
    public static void main(String[] args)
    {
        new StreamDemo().testLimitAndSkip();
    }

    public void testLimitAndSkip()
    {
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<Person> personList2 = persons.stream().sorted((p1, p2) ->
                p1.getName().compareTo(p2.getName())).limit(2).collect(Collectors.toList());
        System.out.println(personList2);
//        List<Person> persons = new ArrayList();
//        for (int i = 1; i <= 10000; i++)
//        {
//            Person person = new Person(i, "name" + i);
//            persons.add(person);
//        }
//        List<String> personList2 = persons.stream().
//                map(Person::getName).limit(10).skip(3).collect(Collectors.toList());
//        System.out.println(personList2);
    }

    private class Person
    {
        public int no;
        private String name;

        public Person(int no, String name)
        {
            this.no = no;
            this.name = name;
        }

        public String getName()
        {
            System.out.println(name);
            return name;
        }
    }
}
