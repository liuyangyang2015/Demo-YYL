package com.bright.util;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-28 16:21
 **/
@Component
public class SonBean extends ParentBean
{
    public SonBean()
    {
        System.out.println("SonBean construct");
    }

    @PostConstruct
    public void init2()
    {
        System.out.println("SonBean PostConstruct2");
    }
    @PostConstruct
    public void init1()
    {
        System.out.println("SonBean PostConstruct1");
    }
    @PostConstruct
    public void init3()
    {
        System.out.println("SonBean PostConstruct3");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("SonBean afterPropertiesSet");
    }

}
