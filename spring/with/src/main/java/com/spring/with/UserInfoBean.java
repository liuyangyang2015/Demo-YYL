package com.spring.with;

import java.util.HashMap;
import java.util.Map;

public class UserInfoBean {

	private static Map<String, String> userinfo = new HashMap<String, String>();
	
	static {
		String numberOneUser = "zhangsan";
		String numberOnePassword = "123";
		String numberTwoUser = "lisi";
		String numberTwoPassword = "456";
		userinfo.put(numberTwoUser, numberTwoPassword);
		userinfo.put(numberOneUser, numberOnePassword);
	}

	public static boolean exisitUser(String username) {
		return userinfo.containsKey(username);
	}

	public static boolean confirmPassword(String username, String password) {
		return userinfo.get(username).equals(password);
	}

}
