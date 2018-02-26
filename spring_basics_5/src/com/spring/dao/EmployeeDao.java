package com.spring.dao;

import java.util.List;

import com.spring.entity.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void clear();
	
}
