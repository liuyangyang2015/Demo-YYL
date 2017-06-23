package com.demo.freemarkerDemo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import  freemarker.template.Template;
import freemarker.template.TemplateException;

public class Test1 {

	public static void main(String[] args) throws IOException, TemplateException {
		Template  t = new Template(null,new StringReader("用户名： ${user};URL： ${url};姓名： ${name}"),null);
		Map map = new HashMap();
		map.put("user", "liuyangyang");
		map.put("url", "liuyangyang.com");
		map.put("name", "liyafei");
		t.process(map, new OutputStreamWriter(System.out));
	}

}
