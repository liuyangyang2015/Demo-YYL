package com.liuyy.demo.reflectDemo;

import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class<?> clz = Class.forName("com.liuyy.demo.reflectDemo.A");
		Object o = clz.newInstance();
		Method m = clz.getMethod("foo", String.class);
		for(int i=0;i<226;i++)
		{
			m.invoke(o, Integer.toString(i));
		}
		((A)o).foo("helo");
	}

}
