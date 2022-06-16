package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;
	//retrieve all user
	@GetMapping(path="users")
	public List<User> AllUsers() {
		return service.findAll();
	}
}
