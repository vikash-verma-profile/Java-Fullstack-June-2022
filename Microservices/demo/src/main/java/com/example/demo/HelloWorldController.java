package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//controller
public class HelloWorldController {

	//Methods
	
	//hello-world
	
	@RequestMapping(method=RequestMethod.GET,path="hello-world")
	public String helloworld() {
		return "Vikash Verma";
	}
}
