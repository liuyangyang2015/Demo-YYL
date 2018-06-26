package com.spring.service;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.spring.domain.UserInfoBean;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginValidate {

	@PersistenceContext
	protected EntityManager em;
	
	private String successPage;
	private String errorPage;


	public LoginValidate() {
		System.out.println("LoginValidate 开始 构造！");
	}

	@Transactional(rollbackFor = Exception.class,propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT)
	public String getSuccessPage() {
		return successPage;
	}

	public void setSuccessPage(String successPage) {
		System.out.println("LoginValidate 开始setSuccessPage！");
		this.successPage = successPage;
	}

	public void setErrorPage(String errorPage) {
		System.out.println("LoginValidate 开始setErrorPage！");
		this.errorPage = errorPage;
	}

	private String getErrorPage() {
		return errorPage;
	}

	public Map<String, String> validateRequest(String username, String password)  {
		
		String message = null;
		if (username == null || password == null || username.trim().equals("") || password.trim().equals("")) {
			message = " 用户名或者密码为空";
			Map<String, String> model = new HashMap<String, String>();
			model.put("msg", message);
			model.put("page", getErrorPage());

			return model;

		}

		if (!UserInfoBean.exisitUser(username)) {
			message = username + "不存在";
			Map<String, String> model = new HashMap<String, String>();
			model.put("msg", message);
			model.put("page", getErrorPage());
			return model;
		}
		if (!UserInfoBean.confirmPassword(username, password)) {
			message = username + "密码不正确";
			Map<String, String> model = new HashMap<String, String>();
			model.put("msg", message);
			model.put("page", getErrorPage());
			return model;

		} else {
			Map<String, String> model = new HashMap<String, String>();
			model.put("username", username);
			model.put("page", getSuccessPage());
			return model;
		}
	}

}
