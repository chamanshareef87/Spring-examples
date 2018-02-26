package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;

public class ConstructorDITest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 =  context.getBean("employee1", Employee.class); 
		System.out.println(emp1.toString());
		
		Employee emp2 =  context.getBean("employee2", Employee.class); 
		System.out.println(emp2.toString());
		
		Employee emp3 =  context.getBean("employee3", Employee.class); 
		System.out.println(emp3.toString());
	
	}

}
