package com.liuyy.demo.spring;

import org.springframework.stereotype.Component;

//@Component
public class B {

	public B() {
		System.out.println("creating bean B: " + this);
	}
	
	public String sayHello()
	{
		//System.out.println("Hello ,I am B "+this );
		return "B";
	}

}
