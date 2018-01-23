package com.lan.mq.service;

import java.time.LocalDateTime;

import javax.annotation.Resource;
import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.lan.mq.AsyncCallBean;


@Component("MQService")
public class MQServiceImpl implements MQService{
	
	@Resource(name = "jmsQueueTemplate")
	private JmsTemplate jmsQueueTemplate;
	
	@Value("${print.queue}")
	private String queue;
	
	@Override
	public void setClass(AsyncCallBean bean) {
		jmsQueueTemplate.send(queue, session -> session.createObjectMessage(bean));
		
	}

	@Override
	public void getClass(AsyncCallBean bean) throws JMSException {
		System.out.println(LocalDateTime.now().toString());
		System.out.println(1/0);
//		Object targetClass = contextHolder.getBean(bean.getClazz());
//		try {
//			System.out.println(bean);
//			Object invoke = targetClass.getClass().getMethod(bean.getMethodName(), bean.getParamTypes()).invoke(targetClass, bean.getParamList());
//			System.out.println(invoke);
//			System.out.println(1/0);
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		}
	}

}
