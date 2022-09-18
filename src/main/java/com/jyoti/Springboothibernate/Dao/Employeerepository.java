package com.jyoti.Springboothibernate.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jyoti.Springboothibernate.model.Employee;

@Repository
public interface Employeerepository extends CrudRepository<Employee,Long>{

}
