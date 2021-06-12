package com;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

	
	
	public void displayAllEmployees(List<Employee> ListOfEmployees) {
		ListOfEmployees.stream()
			.collect(Collectors.toList())
			.forEach(System.out::println);
		System.out.println("\n");
	}
	
	
	
	
	
	
	public void calculateYearlySalary(List<Employee> ListOfEmployees, int employeeNumber) {
		Employee e1 = ListOfEmployees.get(employeeNumber);
		System.out.println("Name: " + e1.getEmpName() + "," + " Salary: $" + e1.getSalary() + "\n");
	}
	
	
	
	
	
	
	public void findByEmployeeNo(List<Employee> ListOfEmployees, int employeeNumber) {
		Employee e1 = ListOfEmployees.get(employeeNumber);
		System.out.println(e1 + "\n");
	}
	
	
	
	
	
	
	public void updateEmployee(List<Employee> ListOfEmployees, int employeeNumber) {
		//Iterator<Employee> it = emp.iterator();
		Scanner upEmployee = new Scanner(System.in);
		Employee e1 = ListOfEmployees.get(employeeNumber);
		System.out.println("UPDATE OPTIONS:\n"
				+ "1. Name\n"
				+ "2. Salary\n"
				+ "3. Address\n");
		int updateOptionNumber = upEmployee.nextInt();
			
		switch(updateOptionNumber) {
			case 1: 
				System.out.println(": NAME :\n");
				System.out.println("Current name: " + e1.getEmpName());
				System.out.println("New name: ");
				String newName = upEmployee.nextLine();
				e1.setEmpName(newName);
				break;
		
			case 2:
				System.out.println(": SALARY :\n");
				System.out.println(e1.getEmpName() + ", " + "Current salary: " + e1.getSalary());
				System.out.println("New salary: ");
				Double newSalary = upEmployee.nextDouble();
				e1.setSalary(newSalary);
				break;
				
			case 3:
				System.out.println(": ADDRESS :\n");
				System.out.println(e1.getEmpName() + ", " + "Current location: " + e1.getAddress());
				System.out.println("New city: ");
				String newCity = upEmployee.nextLine();
				System.out.println(newCity);
				System.out.println("New state: ");
				String newState = upEmployee.nextLine();
				e1.setAddress(new Address(newCity, newState));
				break;
				}	
			}
		
		
	
	
	
	
	
	public void deleteEmployee(List<Employee> ListOfEmployees, int employeeNumber) {
		//Iterator<Employee> it = emp.iterator();
		Scanner deleteEmployee = new Scanner(System.in);
		Employee e1 = ListOfEmployees.get(employeeNumber);
		System.out.println("Would you like to delete " + e1.getEmpName() + "?");
		int deleteE = deleteEmployee.nextInt();
		switch(deleteE) {
		case 1: 
			ListOfEmployees.remove(e1);
			break;
		
		case 2:
			break;
		}
	}	
		

	

	
	



}	
				
			

