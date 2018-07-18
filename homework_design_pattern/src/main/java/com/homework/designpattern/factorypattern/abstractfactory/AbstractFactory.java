package com.homework.designpattern.factorypattern.abstractfactory;

import com.homework.designpattern.factorypattern.Dinner;

/**
 * @author liuyangyang
 * @create 2018-04-30 11:32 AM
 **/
public abstract  class AbstractFactory {
    public abstract Dinner getRice();
    public abstract Dinner getNoodle();
    public abstract Dinner getDumplings();
}
