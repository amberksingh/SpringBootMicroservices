package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/adddep")
	public Department saveDepartment(@RequestBody Department dep) {
		
		System.out.println("save department");
		return departmentService.saveDepartment(dep);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") long departmentId) {
		System.out.println("findDepartment");
		return departmentService.findDepartmentById(departmentId);
	}

}
