package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public User saveUser(@RequestBody User user) {
		
		System.out.println("save user");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id") int userId) {
		return userService.findUserById(userId);
	}
	
	@GetMapping("/findUserWithDepartment/{id}")
	public ResponseTemplateVO findUserWithDepartment(@PathVariable("id") int userId) {
		System.out.println("findUserWithDepartment");
		return userService.findUserWithDepartment(userId);
	}

}
