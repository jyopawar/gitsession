package com.jyoti.Springboothibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyoti.Springboothibernate.Dao.Employeerepository;
import com.jyoti.Springboothibernate.model.Employee;

@ Service
public class Employeeservice {

	@Autowired
	 Employeerepository employeerepository;
	 
	public Employee getEmployee(Long id) {
		return employeerepository.findById(id).orElse(null);
	}
	
	public Employee SaveEmployee(Employee employee) {
		return employeerepository.save(employee);
	}
}

