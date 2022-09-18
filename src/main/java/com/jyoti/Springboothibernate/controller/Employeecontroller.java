package com.jyoti.Springboothibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jyoti.Springboothibernate.model.Employee;
import com.jyoti.Springboothibernate.service.Employeeservice;

@RestController
//@RequestMapping("/api")
public class Employeecontroller {
	
	@ResponseBody
	@RequestMapping("/form")
	public String register(){
		System.out.println("hi");
		return "registration.jsp";
	}

	@Autowired
	Employeeservice employeeservice;


	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id")Long id) {
		return employeeservice.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeservice.SaveEmployee(employee);
		
	}
}

