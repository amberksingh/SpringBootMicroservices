package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class FallbackMethodController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User Service is down"+
				"please try after sometime";
	}
	
	@GetMapping("/departmentServiceFallback")
	//@HystrixCommand()
	public String departmentServiceFallback() {
		return "Department Service is down"+
				"please try after sometime";
	}

}
