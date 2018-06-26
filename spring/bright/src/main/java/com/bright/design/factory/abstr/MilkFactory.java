package com.bright.design.factory.abstr;

import com.bright.design.factory.Mengniu;
import com.bright.design.factory.Milk;
import com.bright.design.factory.method.MengniuFactory;
import com.bright.design.factory.method.SanluFactory;
import com.bright.design.factory.method.TelunsuFactory;
import com.bright.design.factory.method.YiliFactory;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 22:54
 **/
public class MilkFactory extends AbstractFactory
{
    @Override
    public Milk getMengniu()
    {
//        return new Mengniu();
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili()
    {
        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTelunsu()
    {
        return new TelunsuFactory().getMilk();
    }

    @Override
    public Milk getSanlu()
    {
        return new SanluFactory().getMilk();
    }
}
