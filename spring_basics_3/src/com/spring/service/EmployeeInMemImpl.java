package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;

public class EmployeeInMemImpl implements EmployeeDao {

	List<Employee> employees = new ArrayList<>();
	
	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return this.employees;
	}

	@Override
	public void clear() {
		employees.clear();
	}

	
}
