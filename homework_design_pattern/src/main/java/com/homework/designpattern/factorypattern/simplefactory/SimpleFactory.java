package com.homework.designpattern.factorypattern.simplefactory;

import com.homework.designpattern.factorypattern.Dinner;
import com.homework.designpattern.factorypattern.Dumplings;
import com.homework.designpattern.factorypattern.Noodle;
import com.homework.designpattern.factorypattern.Rice;

/**
 * @author liuyangyang
 * @create 2018-04-30 11:21 AM
 **/
public class SimpleFactory {
    public Dinner getDinner(String name)
    {
        if("rice".equals(name))
        {
            return new Rice();
        }
        else if("noodle".equals(name))
        {
            return new Noodle();
        }
        else if("dumplings".equals(name))
        {
            return new Dumplings();
        }
        return null;
    }
}
