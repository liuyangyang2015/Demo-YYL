package com.demo.httpclient;
// to test instance invoke  abstract method 
public abstract class AbstractTest {

	abstract void say();
	void say(String str){
		this.say();
	}
}
