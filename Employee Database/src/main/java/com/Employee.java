package com;

public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	private Address address;
	
	
	// Parameterized constructor
	public Employee (int empNo, String empName, double salary, Address address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	

	
	// Generate getters and setters
	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return this.salary;
	}


	public double setSalary(double salary) {
		return this.salary;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Employee # " + empNo + "," + " Name: " + empName + "," + " Salary: " + salary
				+ " City/State: " + address;
	}
}
