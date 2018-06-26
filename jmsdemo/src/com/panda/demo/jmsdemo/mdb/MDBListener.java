package com.panda.demo.jmsdemo.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//
//@MessageDriven(activationConfig = {
//		  @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
//        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
//        @ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/queue/TestQ"),
//})
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/topic/MyTopic"),
		@ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable"),
		@ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "myTopic"),
		@ActivationConfigProperty(propertyName = "clientID", propertyValue = "consumer0"), })
public class MDBListener implements MessageListener {

	static boolean quit = false;

	// 设置监听器
	@Override
	public void onMessage(Message message) {
		TextMessage msg = (TextMessage) message;
		try {
			System.out.println("接收到的消息内容：" + msg.getText() + ",Time:" + msg.getStringProperty("time"));
			if (msg.getText().equals("quit")) {
				quit = true;
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}