package com.restapi.assign.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.assign.dao.EmployeeDao;
import com.restapi.assign.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public Optional<Employee> getEmployee(int id){
		return dao.findById(id);
	}
	
	public Employee updateRecord(Employee emp) {
		return dao.save(emp);
	}
	
	public void deleteRecord(int id) {
		dao.deleteById(id);
	}
	
	public List<Employee> getEmployees(){
		return dao.findAll();
	}
	
	public Employee addRecord(Employee emp) {
		dao.save(emp);
		return emp;
	}
	
	
}
