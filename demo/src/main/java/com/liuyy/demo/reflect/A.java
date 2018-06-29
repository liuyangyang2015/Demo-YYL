package com.liuyy.demo.reflect;

import java.lang.reflect.Field;

public class A {

	private String str = "dps";

	public String getStr() {
		return str;
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		A myTest = new A();
		System.out.println(myTest.getStr());
		Class clazz = A.class;
		Field field = clazz.getDeclaredField("str");
		field.setAccessible(true);
		field.set(myTest, "change");
		System.out.println(myTest.getStr());

	}

}
