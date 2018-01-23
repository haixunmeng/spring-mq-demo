package com.lan.mq.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;

import com.lan.mq.util.CentralLogger;


public class MQService{
	
	private static CentralLogger logger = CentralLogger.getInstance();
	
	@Resource(name = "jmsQueueTemplate")
	private JmsTemplate jmsQueueTemplate;
	
	@Value("${print.queue}")
	private String queue;
	
	public void sayHello(String message) {
		logger.info("say {}", message);
		jmsQueueTemplate.send(queue, session -> session.createTextMessage(message));
		
	}

	public void onMessage(String message){
		logger.info(message);
		System.out.println(1/0);
	}

}
