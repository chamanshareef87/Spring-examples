package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;

public class EmployeeServiceImpl_v1 implements EmployeeService {

	private EmployeeDao employeeDao;

	//Autowiring by annotation
	@Autowired
	public void setMethodForEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public EmployeeServiceImpl_v1() {
	}
	
	public EmployeeServiceImpl_v1(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void clear() {
		employeeDao.clear();
	}
	
}
