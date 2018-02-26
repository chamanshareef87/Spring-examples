package com.spring;

public class Employee {

	int employeeNo;
	String employeeName;
	String email;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(int employeeNo, String employeeName, String email, double salary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
}
