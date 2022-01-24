package com.springboot.example.com.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootExampleApplication {

	@GetMapping("/")
	public String getMapping() {
		return "Welcome To spring";
	}
	
	@GetMapping("/{input}")
	public String sayCongrats(@PathVariable String input) {
		return "Hi"+input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

}
