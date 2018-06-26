package com.bright.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-26 16:00
 **/
public class InitializingBeanTest
{
    public static void main(String[] args) throws IOException
    {
//        Resource resource = new FileSystemResource("C:/beans.xml");
        Resource resource1 = new ClassPathResource("beans.xml");
//        BeanFactory beanFactory = new FileSystemXmlApplicationContext("C:/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource1);
        LombokDemo lombokDemo = (LombokDemo) beanFactory.getBean("lombok");
        System.out.println("hi, " + lombokDemo.getName());

//        Exception in thread "main" org.springframework.beans.factory.BeanIsNotAFactoryException: Bean named 'lombok' is expected to be of type 'org.springframework.beans.factory.FactoryBean' but was actually of type 'com.bright.util.LombokDemo'
//        Object object1 = beanFactory.getBean("&lombok");
//        System.out.println(object1);
    }
}
