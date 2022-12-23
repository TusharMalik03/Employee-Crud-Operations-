package com.restapi.assign.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.assign.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
