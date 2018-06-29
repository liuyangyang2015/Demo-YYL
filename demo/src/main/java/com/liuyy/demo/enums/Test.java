package com.liuyy.demo.enums;

public class Test {
	public static void main(String[] args) {
		System.out.println("Today is " + WeekdayType.Friday);
		for(WeekdayType  day :WeekdayType.values()){
		System.out.println(day);
		System.out.println(WeekdayType.values()[3]);
		}
	}
}
