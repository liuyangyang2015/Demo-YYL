package com.liuyy.demo.thisdemo;

public class ThisDemo {
	String name = "Mick";
	String boy = "Boy";
	static  String  girl = "Girl";
	//static final String  girl = "Girl";   ERROR
	
	public void print(String name) {
		this.name="name";
		girl="hello kitty";
		System.out.println("类中的属性 name=" + this.name);
		System.out.println("局部传参的属性=" + name);
		
		System.out.println("类中的属性 name=" + this.boy);
		System.out.println("类中的属性 name=" + boy);
		
		System.out.println("类中的属性 name=" + this.girl);
		System.out.println("类中的属性 name=" + girl);
	}

	public static void main(String[] args) {
		ThisDemo tt = new ThisDemo();
		tt.print("Orson");
		//System.out.println("类中的属性 name=" + this.name);   ERROR
		//System.out.println("类中的属性 name=" + name);   ERROR
		
		//System.out.println("类中的属性 name=" + this.girl);   ERROR
		System.out.println("类中的属性 name=" + girl);
		
		System.out.println("类中的属性 name=" + tt.name);
		
		ThisDemo tt2 = new ThisDemo();
		System.out.println("类中的属性 name=" + tt2.girl+":"+tt2.name);
	}
}
