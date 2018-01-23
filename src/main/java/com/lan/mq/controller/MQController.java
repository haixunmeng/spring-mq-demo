package com.lan.mq.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lan.mq.service.MQService;

@Controller
public class MQController {
	
	@Autowired
	private MQService mqService;
	
	@RequestMapping(value = "/say-hello", method = RequestMethod.POST)
	public @ResponseBody String set(){
		mqService.sayHello(LocalDateTime.now().toString());
		return "OK";
	}
	
}
