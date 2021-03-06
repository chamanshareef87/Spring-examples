package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;
import com.spring.service.EmployeeInMemImpl;
import com.spring.service.EmployeeService;
import com.spring.service.EmployeeServiceImpl;

public class AutowireDITest{

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp1 =  context.getBean("employee1", Employee.class); 
		Employee emp2 =  context.getBean("employee2", Employee.class); 
		
		EmployeeService empService =  context.getBean("employeeService1", EmployeeServiceImpl.class);
		empService.addEmployee(emp1);
		empService.addEmployee(emp2);
		List<Employee> employees1 = empService.getAllEmployees();
		System.out.println("========autowire by name=========");
		for(Employee employee :  employees1) {
			System.out.println(employee.toString());
		}
		empService.clear();
		
		EmployeeService empService1 =  context.getBean("employeeService2", EmployeeServiceImpl.class);
		empService1.addEmployee(emp1);
		empService1.addEmployee(emp2);
		List<Employee> employees2 = empService1.getAllEmployees();
		System.out.println("========autowire by Type=========");
		for(Employee employee :  employees2) {
			System.out.println(employee.toString());
		}
		empService1.clear();
		
		EmployeeService empService2 =  context.getBean("employeeService3", EmployeeServiceImpl.class);
		empService2.addEmployee(emp1);
		empService2.addEmployee(emp2);
		List<Employee> employees3 = empService2.getAllEmployees();
		System.out.println("========autowire by constructor=========");
		for(Employee employee :  employees3) {
			System.out.println(employee.toString());
		}

	}

}
