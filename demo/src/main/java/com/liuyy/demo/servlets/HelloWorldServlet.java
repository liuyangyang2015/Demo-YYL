package com.liuyy.demo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("hello")
public class HelloWorldServlet extends HttpServlet{  
	   
    /** 
     * 查看httpservlet实现的service一看便知，起到了一个controll控制器的作用(转向的) 
     * 之后便是跳转至我们熟悉的doget,dopost等方法中  
     */  
    @Override  
    protected void service(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        System.out.println("doservice...0000000000000000000"+this.getInitParameter("encoding"));  
          
        super.service(req, resp);  
    }  
   
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        System.out.println("doget...111111111111111"); 
        //resp.setStatus(resp.SC_MOVED_TEMPORARILY);
        //doPost(req, resp);  
    }  
   
    @Override  
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        System.out.println("dopost...2222222222222222");  
        super.doPost(req, resp);
        System.out.println("dopost...33333333333333"); 
    }  
      
      
   
 }  
