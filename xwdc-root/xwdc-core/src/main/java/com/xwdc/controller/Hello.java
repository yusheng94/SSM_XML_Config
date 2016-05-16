package com.xwdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xwdc.domain.UserInfo;
import com.xwdc.service.HelloService;

@Controller
public class Hello {
	@Autowired
	private HelloService helloService;

	@RequestMapping("/hello")
	public @ResponseBody String helloWorld(String id) {
		UserInfo user = new UserInfo();
		user.setId(id);
		return helloService.hello(user);
	}
	
	@RequestMapping("/insert")
	public @ResponseBody String insert(String id,String userName, String userAge, String userAdd) {
		UserInfo user = new UserInfo();
		user.setUserName(userName);
		user.setUserAge(userAge);
		user.setUserAdd(userAdd);
		helloService.insert(user);
		return null;
	}
	
	@RequestMapping("/batch")
	public @ResponseBody String batch() {
		helloService.batch();
		return null;
	}
}
