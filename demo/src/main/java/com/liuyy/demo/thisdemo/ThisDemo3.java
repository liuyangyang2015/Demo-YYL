package com.liuyy.demo.thisdemo;

public class ThisDemo3 {

	String name;
	int age;
	public ThisDemo3()
	{
		this.age=21;
	}
	
	public ThisDemo3(String name,int age)
	{
		this();
		this.name="Mick";
	}
	private void print()
	{
		System.out.println("最終名字="+this.name);
		System.out.println("最終的年齡="+this.age);
	}
	
	public static void main(String[] args)
	{
		ThisDemo3 tt=new ThisDemo3("",0);
		tt.print();
	}
	
}
