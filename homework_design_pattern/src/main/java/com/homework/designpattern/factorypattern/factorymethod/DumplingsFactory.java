package com.homework.designpattern.factorypattern.factorymethod;

import com.homework.designpattern.factorypattern.Dinner;
import com.homework.designpattern.factorypattern.Dumplings;

/**
 * @author liuyangyang
 * @create 2018-04-30 11:28 AM
 **/
public class DumplingsFactory implements Factory {
    @Override
    public Dinner getDinner() {
        return new Dumplings();
    }
}
