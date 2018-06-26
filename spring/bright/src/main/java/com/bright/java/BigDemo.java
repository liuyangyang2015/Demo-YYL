package com.bright.java;

import java.math.BigDecimal;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-28 15:51
 **/
public class BigDemo
{
    public static void main(String[] args)
    {
        Double e = 1e-10;
        System.out.println(e);
        System.out.println(new BigDecimal(e));
        System.out.println(Double.parseDouble(e.toString()));
        System.out.println(new BigDecimal(Double.parseDouble(e.toString())));
    }
}
