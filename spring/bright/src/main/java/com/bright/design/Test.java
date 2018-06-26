package com.bright.design;

import com.bright.design.factory.Mengniu;
import com.bright.design.factory.Telunsu;
import com.bright.design.factory.abstr.MilkFactory;
import com.bright.design.factory.method.TelunsuFactory;
import com.bright.design.factory.prototype.simple.Prototype;
import com.bright.design.factory.simple.SimpleFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 21:29
 **/
public class Test
{
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException
    {
//        //自给自足
//        System.out.println(new Telunsu());
//
//        //小作坊  简单工厂设计模式
//        SimpleFactory factory = new SimpleFactory();
//        System.out.println(factory.getMilk("telunsu"));//参数用户不知  可能出错
//
//        //现代工厂  工厂方法模式
//        System.out.println(new TelunsuFactory().getMilk());
//
//        //流水线    抽象工厂
//        System.out.println(new MilkFactory().getTelunsu());

        //浅复制
        Prototype prototype = new Prototype();
        prototype.setName("Tom");
        prototype.getList().add("1");
        Prototype prototype1 = (Prototype) prototype.deepClone();
        prototype1.getList().add("2");
        prototype1.setName("123");
        System.out.println(prototype);
        System.out.println(prototype1);
        System.out.println(prototype.getName());
        System.out.println(prototype1.getName());
        System.out.println(prototype.getList().hashCode());
        System.out.println(prototype1.getList().hashCode());
        System.out.println(prototype.getList().toString());
        System.out.println(prototype1.getList().toString());


        Mengniu mengniu = new Mengniu();
        Mengniu mengniu1 = new Mengniu();
        mengniu1 = mengniu;
        System.out.println(Integer.toHexString(mengniu.hashCode()));
        System.out.println(mengniu1);
        System.out.println(mengniu == mengniu1);

    }
}
