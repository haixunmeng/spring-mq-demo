package com.lan.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lan.mq.AsyncCallBean;
import com.lan.mq.service.MQService;
import com.lan.mq.service.PrintService;

@Controller
public class MQController {
	
	@Autowired
	private MQService mqService;
	
	@Autowired
	private PrintService printService;
	
	
	@RequestMapping(value = "/set", method = RequestMethod.POST)
	public @ResponseBody String set(){
		
		printService.x(100);
		
		System.out.println(printService);
		
		mqService.setClass(AsyncCallBean
			.of()
			.setClazz(printService.getClass())
			.setMethodName("x")
			.setParamTypes(Integer.class)
			.setParamList(1000));
		
		mqService.setClass(AsyncCallBean
			.of()
			.setClazz(printService.getClass())
			.setMethodName("hello"));
		
		return "OK";
	}
	
}
