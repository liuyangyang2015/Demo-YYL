package com.liuyy.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@SuppressWarnings("serial")
@Controller
public class D  {
	
	@Resource
	private A a;
	@Resource
	private B b;
	@Autowired
	//@Resource
	private C ccc;
	//@Resource
//	 @Autowired
//	public void setCcc(C n) {
//		System.out.println("setting ccc with " + n);
//		this.ccc = n;
//		//ccc.sayHello();
//	}

	public D() {
		System.out.println("creating bean D: " + this);
	}
	@RequestMapping("d")
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{   
		String a=ccc.sayHello();
		System.out.println(a);
		System.out.println(b);
		System.out.println(ccc);
		response.getWriter().print("Hello ,I am D !" +'a');
	}

}
