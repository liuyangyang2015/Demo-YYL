package com.bright.design.factory.method;

import com.bright.design.factory.Milk;
import com.bright.design.factory.Sanlu;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 22:57
 **/
public class SanluFactory implements Factory
{
    @Override
    public Milk getMilk()
    {
        return new Sanlu();
    }
}
