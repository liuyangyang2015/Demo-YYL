package com.demo.freemarkerDemo;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
public class Test2 {
	private Configuration  cfg;
	
	public void init() throws IOException
	{
		cfg = new Configuration();
		cfg.setDirectoryForTemplateLoading(new File("F:/applicationDemos/applicationDemos/freemarkerDemo/src/main/webapp/ftl"));
	}
	public void process() throws Exception
	{
		Map map = new HashMap(); 
        map.put("user", "lavasoft"); 
        map.put("url", "http://www.baidu.com/"); 
        map.put("name", "百度");
        
        Template t = cfg.getTemplate("test.ftl");
        
        t.process(map, new OutputStreamWriter(System.out));
	}
	public static void main(String[] args) throws Exception {
		Test2 t2 = new Test2();
		t2.init();
		t2.process();
	}

}
