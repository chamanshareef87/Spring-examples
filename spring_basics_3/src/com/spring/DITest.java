package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;
import com.spring.service.EmployeeInMemImpl;
import com.spring.service.EmployeeService;
import com.spring.service.EmployeeServiceImpl;

public class DITest{

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp1 =  context.getBean("employee1", Employee.class); 
		Employee emp2 =  context.getBean("employee2", Employee.class); 
		EmployeeDao dao = context.getBean("employeeService", EmployeeInMemImpl.class);
		dao.addEmployee(emp1);
		dao.addEmployee(emp2);
		List<Employee> employees = dao.getAllEmployees();
		System.out.println("=================");
		for(Employee employee :  employees) {
			System.out.println(employee.toString());
		}
		dao.clear();

	}

}
