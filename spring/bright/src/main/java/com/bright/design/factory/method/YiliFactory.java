package com.bright.design.factory.method;

import com.bright.design.factory.Milk;
import com.bright.design.factory.Yili;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 22:56
 **/
public class YiliFactory implements Factory
{
    @Override
    public Milk getMilk()
    {
        return new Yili();
    }
}
