package com.example.ApiDevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDevopsApplication.class, args);
	}

	@GetMapping("/")
	public String oi(){
		return "Estudos Devops";
	}
}
