package com.homework.designpattern.factorypattern.factorymethod;

import com.homework.designpattern.factorypattern.Dinner;
import com.homework.designpattern.factorypattern.Rice;

/**
 * @author liuyangyang
 * @create 2018-04-30 11:27 AM
 **/
public class RiceFactory implements Factory {
    @Override
    public Dinner getDinner() {
        return new Rice();
    }
}
