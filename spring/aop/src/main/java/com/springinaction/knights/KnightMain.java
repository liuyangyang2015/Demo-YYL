package com.springinaction.knights;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.springinaction.knights.config.KnightConfig;

public class KnightMain {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		//knight.
		context.close();	
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:\\workspace\\JavaApplication2\\src\\javaapplication2\\spring\\beans.xml"));
//		AbstractBeanFactory
	}
}
