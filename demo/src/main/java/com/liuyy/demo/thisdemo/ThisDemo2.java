package com.liuyy.demo.thisdemo;

public class ThisDemo2 {

	int number;

	ThisDemo2 increment() {
		number++;
		return this;
	}

	private void print() {
		System.out.println("number=" + number);
	}

	public static void main(String[] args) {
		ThisDemo2 tt = new ThisDemo2();
		tt.increment().increment().increment().print();
	}
}
