package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;

public class EmployeeServiceImpl_v2 implements EmployeeService {

	//Autowiring by annotation
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public EmployeeServiceImpl_v2() {
	}
	
	public EmployeeServiceImpl_v2(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void clear() {
		employeeDao.clear();
	}
	
}
