package com.homework.designpattern.factorypattern;

import com.homework.designpattern.factorypattern.abstractfactory.DinnerFactory;
import com.homework.designpattern.factorypattern.factorymethod.NoodleFactory;
import com.homework.designpattern.factorypattern.simplefactory.SimpleFactory;

public class Test {


    public static void main(String[] args) {

        //自己动手  需要时自己new一个对象
        //不使用设计模式  晚餐  米饭 面条 水饺
        Dinner dinnerSelf = new Noodle();
        System.out.println(dinnerSelf);

        //保姆动手（类似小作坊 什么都能自己动手做）
        //简单工厂设计模式
        Dinner dinnerSimple = new SimpleFactory().getDinner("noodle");
        System.out.println(dinnerSimple);

        //黄焖鸡米饭饭馆 东北饺子店 兰州拉面  饭店（专门的工厂 专业做一种产品）
        //工厂方法设计模式
        Dinner dinnerMehod = new NoodleFactory().getDinner();
        System.out.println(dinnerMehod);

        //美团外卖  外卖平台（大型百货 什么都能买到并且都是专门工厂提供的 ）
        //抽象工厂设计模式
        Dinner dinnerAbstract = new DinnerFactory().getNoodle();
        System.out.println(dinnerAbstract);
    }


}
