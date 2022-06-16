package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//controller
public class HelloWorldController {

	//Methods
	
	//hello-world
	
	@RequestMapping(method=RequestMethod.GET,path="hello-world")
	public String helloworld() {
		return "Hello";
	}
}
