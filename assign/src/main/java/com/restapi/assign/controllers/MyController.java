package com.restapi.assign.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.assign.entity.Employee;
import com.restapi.assign.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService e;
	
	//For Fetching All Records
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return e.getEmployees();
	}
	
	//For Fetching a Single Record based on ID
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return e.getEmployee(id);
	}
	
	//For Deletion
	@DeleteMapping("/delete/{id}")
	public void deleteRecord(@PathVariable("id") int id){
		e.deleteRecord(id);
	}
	
	@PostMapping("/add")
	public Employee addRecord(@RequestBody Employee emp) {
		e.addRecord(emp);
		return emp;
	}
	
	@PutMapping("/update")
	public Employee updateRecord(@RequestBody Employee emp) {
		return e.updateRecord(emp);
	}
	
	
		
	
}
