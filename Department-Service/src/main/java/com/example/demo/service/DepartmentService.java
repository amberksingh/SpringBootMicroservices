package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	public Department saveDepartment(Department dep) {
		return departmentRepo.save(dep);
	}
	
	public Department findDepartmentById(long id) {
		
		Optional<Department> deps =departmentRepo.findById(id);
		System.out.println("findDepartment inside department service");
		return deps.get();
	}

}
