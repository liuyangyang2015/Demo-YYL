package com.liuyy.demo.superdemo;

public class Student {

	String name = "studnet";
	int age = 18;
	String className;

	public void learn() {
		System.out.println("I am a student! I am learning!");
		sing();
		dance();
	}

	public void sing() {
		System.out.println("Singing!");
	}

	public void dance() {
		System.out.println("Dancing!");
	}

}
