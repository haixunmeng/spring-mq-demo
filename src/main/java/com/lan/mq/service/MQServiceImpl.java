package com.lan.mq.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

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
	
	@Autowired
	private ContexHolder contextHolder;
	
	@Override
	public void setClass(AsyncCallBean bean) {
		jmsQueueTemplate.send(queue, session -> session.createObjectMessage(bean));
		
	}

	@Override
	public void getClass(AsyncCallBean bean) {
		Object targetClass = contextHolder.getBean(bean.getClazz());
		try {
			Object invoke = targetClass.getClass().getMethod(bean.getMethodName(), bean.getParamTypes()).invoke(targetClass, bean.getParamList());
			System.out.println(invoke);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(targetClass);
	}

}
