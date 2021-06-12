package com;

import java.util.List;

public interface EmployeeService {

	public void displayAllEmployees(List<Employee> employee);
	
	public void calculateYearlySalary(List<Employee> employee, int employeeNumber);
	
	public void findByEmployeeNo(List<Employee> employee, int employeeNumber);
	
	public void updateEmployee(List<Employee> employee, int employeeNumber);
	
	public void deleteEmployee(List<Employee> employee, int employeeNumber);
}
