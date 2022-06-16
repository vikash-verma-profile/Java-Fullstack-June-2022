package com.example.demo;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//controller
public class HelloWorldController {

	//Methods
	
	//hello-world
	
	@GetMapping(path="hello-world")
	public String helloworld() {
		return "Vikash Verma";
	}
	//hello-world-bean
	@RequestMapping(method = RequestMethod.GET,path="hello-world-bean")
	public HelloWordBean helloWorldBean() {
		return new HelloWordBean("Hello World");
	}
}
