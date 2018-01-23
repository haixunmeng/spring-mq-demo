package com.lan.mq.service;

import javax.jms.JMSException;

import com.lan.mq.AsyncCallBean;

public interface MQService {
	
	public void setClass(AsyncCallBean bean);
	
	public void getClass(AsyncCallBean bean) throws JMSException;
	
	
}
