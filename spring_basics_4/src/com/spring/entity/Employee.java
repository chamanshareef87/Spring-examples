package com.spring.entity;

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

	public int getEmployeeNo() {
		return employeeNo;
	}


	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
}
