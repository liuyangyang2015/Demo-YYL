package com.liuyy.demo.superdemo;

public class ExcellentStudent extends Student{

	String tag="I am an excellent student! I learn well!";
	
	public void learn()
	{
		System.out.println(tag);
		super.learn();
	}
//	public void sing()
//	{
//		System.out.println("Excellent Singing!");
//	}
//	public void dance()
//	{
//		System.out.println("Excellent Dancing!");
//	}
	
	public static void main(String[] args)
	{
		ExcellentStudent es=new ExcellentStudent();
		es.learn();
	}
}
