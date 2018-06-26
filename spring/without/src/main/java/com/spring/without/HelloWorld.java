package com.spring.without;

import java.io.*;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {
	
	private LoginValidate loginValidate;

	public void init() throws ServletException {
		System.out.println("HelloWorld servlet 开始初始化！");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		loginValidate = new LoginValidate();
		loginValidate.setErrorPage("error.jsp");
		loginValidate.setSuccessPage("success.jsp");
		
		Map<String, String> model = loginValidate.validateRequest(username, password);
		
		String msg = model.get("msg");
		System.out.println(msg);
		String page = model.get("page");
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect(page);
	}

	public void destroy() {
		System.out.println("HelloWorld servlet 开始销毁！");
	}
}