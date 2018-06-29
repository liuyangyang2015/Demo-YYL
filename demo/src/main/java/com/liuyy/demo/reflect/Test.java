package com.liuyy.demo.reflect;

import java.lang.reflect.Method;
public class Test {

	public static void main(String[] args) throws Exception {
		// 加载并初始化命令行参数所指定的类
		Class classType = Class.forName(args[0]);
		// 获取到该类所对应的所有方法
		Method method[] = classType.getDeclaredMethods();
		// 打印出类的所有方法
		for (Method m : method) {
			System.out.println(m.toString());
		}
	}

}
