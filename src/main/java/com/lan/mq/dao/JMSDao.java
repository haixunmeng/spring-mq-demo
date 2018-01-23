package com.lan.mq.dao;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JMSDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert1() {
		jdbcTemplate.update("insert into jms_test(msg) values(?)", new Object[] {LocalDateTime.now().toString()});
	}
	
}
