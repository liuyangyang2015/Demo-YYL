package com.liuyy.demo;

public class Test {

	public static void main(String[] args) {
		Integer n = 100;
		System.out.println(n instanceof Integer);
		System.out.println(Integer.class.isInstance(n));
		System.out.println(Integer.TYPE.getName());
		System.out.println(Integer.class.getName());
		System.out.println(Number.class.getName());
		System.out.println(Number.class.isInstance(n));
	}

}
