package com.lan.mq.service;

import com.lan.mq.AsyncCallBean;

public interface MQService {
	
	public void setClass(AsyncCallBean bean);
	
	public void getClass(AsyncCallBean bean);
	
	
}
