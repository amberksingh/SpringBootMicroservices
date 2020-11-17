package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.vo.Department;
import com.example.demo.vo.ResponseTemplateVO;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RestTemplate restTemplate;//=new RestTemplate();
	
	public User saveUser(User dep) {
		return userRepo.save(dep);
	}
	
	public User findUserById(int id) {
		Optional<User> deps =userRepo.findById(id);
		return deps.get();
	}
	
	public ResponseTemplateVO findUserWithDepartment(int id) {
		
		ResponseTemplateVO templateVO=new ResponseTemplateVO();
		User user=findUserById(id);
		System.out.println(user);
		Department department=restTemplate.getForObject("http://department-service/departments/"+user.getDepartmentId(), Department.class);
		templateVO.setDepartment(department);
		templateVO.setUser(user);
		return templateVO;
	}

}
