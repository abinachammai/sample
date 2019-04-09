package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Application_Configuration{
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello World!!";
	}
	
	
}
