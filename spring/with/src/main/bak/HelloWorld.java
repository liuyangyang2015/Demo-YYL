package com.spring.with;

import java.io.*;
import java.util.Map;

import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorld /* extends HttpServlet */ {

	private LoginValidate loginValidate;

	public HelloWorld() {
		System.out.println("HelloWorld servlet 开始 构造！");
	}

	public LoginValidate getLoginValidate() {
		return loginValidate;
	}

	@Autowired
	public void setLoginValidate(LoginValidate loginValidate) {
		System.out.println("HelloWorld servlet 开始 setLoginValidate！");
		this.loginValidate = loginValidate;
	}

	public void init() throws ServletException {
		System.out.println("HelloWorld servlet 开始初始化！");
	}

	@RequestMapping("/hello")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(loginValidate.toString());
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