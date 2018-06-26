package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.LoginValidate;



//@Component
@Controller
@RequestMapping("/a")
public class HelloWorld  {

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

	/*@RequestMapping("/hello")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(loginValidate.toString());
		System.out.println("123");
		doSo(request, response);

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(loginValidate.toString());
		Map<String, String> model = loginValidate.validateRequest(username, password);

		String msg = model.get("msg");
		System.out.println(msg);
		String page = model.get("page");
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect(page);
	}*/
	
	/*@RequestMapping("/hello")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(loginValidate.toString());
		System.out.println("123");
		doSo(request, response);

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(loginValidate.toString());
		Map<String, String> model = loginValidate.validateRequest(username, password);

		String msg = model.get("msg");
		System.out.println(msg);
		String page = model.get("page");
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect(page);
	}*/
	
	@RequestMapping("/b")
	public void doSo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter(); 
		out.println("123");
		/*String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println(loginValidate.toString());
		Map<String, String> model = loginValidate.validateRequest(username, password);

		String msg = model.get("msg");
		System.out.println(msg);
		String page = model.get("page");
		request.getSession().setAttribute("msg", msg);
		response.sendRedirect(page);*/
	}

	public void destroy() {
		System.out.println("HelloWorld servlet 开始销毁！");
	}
}