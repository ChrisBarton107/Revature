package com;

import java.util.List;

public interface EmployeeService {

	public void displayAllEmployees(List<Employee> ListOfEmployees);
	
	public void calculateYearlySalary(List<Employee> ListOfEmployees, int employeeNumber);
	
	public void findByEmployeeNo(List<Employee> ListOfEmployees, int employeeNumber);
	
	public void updateEmployee(List<Employee> ListOfEmployees, int employeeNumber);
	
	public void deleteEmployee(List<Employee> ListOfEmployees, int employeeNumber);
}
