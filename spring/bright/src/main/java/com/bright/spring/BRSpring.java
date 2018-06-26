package com.bright.spring;

import com.bright.util.LombokDemo;
import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-04-26 18:18
 **/
public class BRSpring
{
    public static void main3(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        LombokDemo lombokDemo = (LombokDemo) context.getBean("lombok");
        System.out.println("hi, " + lombokDemo.getName());
    }


    public static void main2(String[] args)
    {
        // 根据 Xml 配置文件创建 Resource 资源对象， 该对象中包含了 BeanDefinition 的信息
        ClassPathResource resource = new ClassPathResource("beans.xml");
        // 创建 DefaultListableBeanFactory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //创建 XmlBeanDefinitionReader 读取器， 用于载入 BeanDefinition。
        // 之所以需要 BeanFactory 作为参数， 是因为会将读取的信息回调配置给 factory
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        // XmlBeanDefinitionReader 执行载入 BeanDefinition 的方法， 最后会完成 Bean 的载入和注册。
        // 完成后 Bean 就成功的放置到 IOC 容器当中， 以后我们就可以从中取得 Bean 来使用
        reader.loadBeanDefinitions(resource);
        LombokDemo lombokDemo = (LombokDemo) factory.getBean("lombok");
        System.out.println("hi, " + lombokDemo.getName());
    }


    public static void main(String[] args) throws IOException
    {
//        Resource resource = new FileSystemResource("C:/beans.xml");
        Resource resource1 = new ClassPathResource("beans.xml");
//        BeanFactory beanFactory = new FileSystemXmlApplicationContext("C:/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource1);
        LombokDemo lombokDemo = (LombokDemo) beanFactory.getBean("lombok");
        System.out.println("hi, " + lombokDemo.getName());
//        Object object1 = beanFactory.getBean("&lombok");
        PropertiesFactoryBean propertiesFactory = new PropertiesFactoryBean();
        Resource resource2 = new FileSystemResource("C:/config.properties");
        propertiesFactory.setLocation(resource2);
        Properties properties = propertiesFactory.getObject();
//        properties.setProperty("name","lyy");
        System.out.println(properties);
        Object object = beanFactory.getBean("property");
        System.out.println(object instanceof Properties);
        Object object2 = beanFactory.getBean("&property");
        System.out.println(object2 instanceof PropertiesFactoryBean);
    }

}
