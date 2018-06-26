package com.bright.design.factory.method;

import com.bright.design.factory.Mengniu;
import com.bright.design.factory.Milk;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 22:55
 **/
public class MengniuFactory implements Factory
{
    @Override
    public Milk getMilk()
    {
        return new Mengniu();
    }
}
