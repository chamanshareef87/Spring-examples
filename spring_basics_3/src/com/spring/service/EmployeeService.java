package com.spring.service;

import java.util.List;

import com.spring.entity.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void clear();
	
}
