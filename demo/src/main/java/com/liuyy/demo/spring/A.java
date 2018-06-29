package com.liuyy.demo.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
/*public class A {
	
//	@Resource
	@Autowired
	private B bbb;
//	@Resource
	@Autowired
	private C ccc;

	public A() {
		System.out.println("creating bean A: " + this);
	}
    @Autowired
	public void setBbb(B bbb) {
		System.out.println("setting A.bbb with " + bbb);
		this.bbb = bbb;
		bbb.sayHello();
	}
    @Autowired
	public void setCcc(C ccc) {
		System.out.println("setting A.ccc with " + ccc);
		this.ccc = ccc;
		ccc.sayHello();
	}
	public void sayHello()
	{
		System.out.println("Hello ,I am A"+this );
	}

}*/


//@Component
public class A {
	//@Resource
	@Autowired
	private B bbb;
	@Resource
	private C ccc;

	public A() {
		System.out.println("creating bean A: " + this);
	}
	 //@Autowired
//	 @Resource
//	public void setBbb(B m) {
//		System.out.println("setting bbb with " + m);
//		this.bbb =m;
//		//bbb.sayHello();
//	}
	// @Autowired
//	 @Resource
//	public void setCcc(C n) {
//		System.out.println("setting ccc with " + n);
//		this.ccc = n;
//		//ccc.sayHello();
//	}
	public String sayHello()
	{
		System.out.println("Hello ,I am "+this );
		return "A";
	}

}
