package com.bright.design.factory.simple;

import com.bright.design.factory.*;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 21:32
 **/
public class SimpleFactory
{
    public Milk getMilk(String name)
    {
        if("telunsu".equals(name))
        {
            return new Telunsu();
        }
        else if("yili".equals(name))
        {
            return  new Yili();
        }
        else if("mengniu".equals(name))
        {
            return new Mengniu();
        }
        else if("sanlu".equals(name))
        {
            return new Sanlu();
        }
        return null;
    }
}
