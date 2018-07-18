package com.homework.designpattern.factorypattern.abstractfactory;

import com.homework.designpattern.factorypattern.Dinner;
import com.homework.designpattern.factorypattern.Rice;
import com.homework.designpattern.factorypattern.factorymethod.DumplingsFactory;
import com.homework.designpattern.factorypattern.factorymethod.NoodleFactory;
import com.homework.designpattern.factorypattern.factorymethod.RiceFactory;

/**
 * @author liuyangyang
 * @create 2018-04-30 11:34 AM
 **/
public class DinnerFactory extends AbstractFactory {
    @Override
    public Dinner getRice() {
        return new RiceFactory().getDinner();
    }

    @Override
    public Dinner getNoodle() {
        return new NoodleFactory().getDinner();
    }

    @Override
    public Dinner getDumplings() {
        return new DumplingsFactory().getDinner();
    }
}
