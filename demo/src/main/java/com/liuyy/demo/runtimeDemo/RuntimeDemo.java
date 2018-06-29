package com.liuyy.demo.runtimeDemo;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		//rt.exec("notepad");
		rt.exec("write");
	}

}
