package com.liuyy.demo.spring;

import org.springframework.stereotype.Component;

//@Component
public class C {

	public C() {
		System.out.println("creating bean C: " + this);
	}

	public String sayHello()
	{
		System.out.println("Hello ,I am C "+this );
		return "C";
	}
	
}
