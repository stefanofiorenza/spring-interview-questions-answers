package com.altafjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.altafjava.bean.GreetingService;

public class GreetingManager {

	private GreetingService greetingService;
	
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void sayGreet() {
		System.out.println(greetingService.greet());
	}
}
