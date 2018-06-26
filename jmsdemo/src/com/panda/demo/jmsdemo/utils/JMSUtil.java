package com.panda.demo.jmsdemo.utils;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * 相同的代码提取出来放在工具类中
 */
public class JMSUtil {
    public final static String JMS_CONNECTION_FACTORY_JNDI = "jms/RemoteConnectionFactory";

    //public final static String JMS_TOPIC_JNDI = " queue/HELLOWORLDMDBQueue";//新建的消息队列/Topic JNDI 发布名称
    public final static String JMS_TOPIC_JNDI = "jms/topic/MyTopic";//新建的消息队列/Topic JNDI 发布名称
    public final static String JMS_USERNAME = "jmstest";//添加的用户名，角色必须是"guest"/ApplicationRealm
    public final static String JMS_PASSWORD = "jmstest";//添加的用户的密码
    private final static String WILDFLY_REMOTING_URL = "http-remoting://localhost:8080";//注意前缀格式和端口

    public static InitialContext getInitialContext() throws NamingException {
        InitialContext context = null;
        try {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
            props.put(Context.PROVIDER_URL, WILDFLY_REMOTING_URL);// NOTICE: "http-remoting" and port "8080"
            props.put(Context.SECURITY_PRINCIPAL, JMS_USERNAME);
            props.put(Context.SECURITY_CREDENTIALS, JMS_PASSWORD);
            //props.put("jboss.naming.client.ejb.context", true);
            context = new InitialContext(props);
            System.out.println("\n\tGot initial Context: " + context);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return context;
    }
}