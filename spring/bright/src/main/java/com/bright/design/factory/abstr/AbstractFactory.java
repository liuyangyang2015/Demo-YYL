package com.bright.design.factory.abstr;

import com.bright.design.factory.Milk;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-29 22:51
 **/
public abstract class AbstractFactory
{
    //公共的逻辑
    //便于统一管理

    public abstract Milk getMengniu();

    public abstract Milk getYili();

    public abstract Milk getTelunsu();

    public abstract Milk getSanlu();
}
