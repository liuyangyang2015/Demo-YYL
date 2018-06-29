package com.liuyy.demo.smtp;

import java.util.Properties;

public class Poster {

	public static void main(String[] args) {
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.126.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("liuyangyang_2010@126.com");
		mailInfo.setPassword("**************");// 您的邮箱密码
		mailInfo.setFromAddress("liuyangyang_2010@126.com");
		mailInfo.setToAddress("1194981258@qq.com");
		mailInfo.setSubject("java mail smtp");
		mailInfo.setContent("This is a test mail 12345!<input /><hr/>");
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		
		sms.sendTextMail(mailInfo);// 发送文体格式
		sms.sendHtmlMail(mailInfo);//发送html格式
		
//		  Properties properties = System.getProperties();
//		  System.out.println(properties.toString());
	}
}



/*
 * public static void main(String[] args) { // 这个类主要是设置邮件 MailSenderInfo
 * mailInfo = new MailSenderInfo();
 * mailInfo.setMailServerHost("smtp.qq.com");
 * mailInfo.setMailServerPort("465"); mailInfo.setValidate(true);
 * mailInfo.setUserName("1194981258@qq.com"); // 自己的邮箱
 * mailInfo.setPassword("************");// 自己的邮箱密码，用于验证
 * 
 * mailInfo.setFromAddress("1194981258@qq.com"); /// 自己的邮箱
 * mailInfo.setToAddress("liuyangyang_2010@126.com"); /// 对方的邮箱
 * mailInfo.setSubject("设置邮箱标题"); mailInfo.setContent("设置邮箱内容");
 * 
 * // 这个类主要来发送邮件 SimpleMailSender sms = new SimpleMailSender();
 * sms.sendTextMail(mailInfo);// 发送文体格式 //sms.sendHtmlMail(mailInfo);//
 * 发送html格式
 * 
 * }
 */