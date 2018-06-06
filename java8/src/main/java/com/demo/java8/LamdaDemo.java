package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-30 16:29
 **/
public  class LamdaDemo
{
    public static void main(String[] args)
    {
        Arrays.asList(1, 2, 3).forEach(a ->
        {
            System.out.println(a);
            System.out.println("====");
        });

        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );

        List<Integer> a= new ArrayList<>();
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            a.add(result) ;
            return result;
        } );
        System.out.println(a);
        InterfaceDemo.hello();
    }

    static class Hello
    {

    }
}
