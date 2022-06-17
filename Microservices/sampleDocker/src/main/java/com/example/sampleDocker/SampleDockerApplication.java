package com.example.sampleDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SampleDockerApplication {

	@GetMapping("message")
	public String getMessage() {
		return "Welcome to Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleDockerApplication.class, args);
	}

}
