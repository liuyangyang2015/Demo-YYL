package com.bright.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-28 16:20
 **/
@Component
public class ParentBean implements InitializingBean
{

    public ParentBean() {
        System.out.println("ParentBean construct123");
    }

    @PostConstruct
    public void init(){
        System.out.println("ParentBean PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ParentBean afterPropertiesSet");
    }

}
