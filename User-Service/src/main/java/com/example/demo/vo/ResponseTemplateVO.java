package com.example.demo.vo;

import com.example.demo.model.User;

public class ResponseTemplateVO {
	
	User user;
	Department department;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ResponseTemplateVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	public ResponseTemplateVO() {
		super();
	}
	
	

}
