package com.lan.mq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lan.mq.dao.JMSDao;
import com.lan.mq.util.CentralLogger;

public class BusService {
	
	private static CentralLogger logger = CentralLogger.getInstance();

	@Autowired
	private JMSDao JMSDao;

	@Transactional
	public void process() {
		JMSDao.insert1();
		logger.info("1 插入成功");
		System.out.println(1/0);
	}
	
}
