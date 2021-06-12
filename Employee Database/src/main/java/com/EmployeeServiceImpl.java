package com;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

	
	
	public void displayAllEmployees(List<Employee> ListOfEmployees) {
		// Displays all employee data with a stream
		ListOfEmployees.stream()
			.collect(Collectors.toList())
			.forEach(System.out::println);
		System.out.println("\n");
	}
	
	
	
	
	
	
	public void calculateYearlySalary(List<Employee> ListOfEmployees, int employeeNumber) {
		Employee e = ListOfEmployees.get(employeeNumber);
		System.out.println("Name: " + e.getEmpName() + "," + " Salary: $" + e.getSalary());
		System.out.println("\n");
	}
	
	
	
	
	
	
	public void findByEmployeeNo(List<Employee> ListOfEmployees, int employeeNumber) {
		Employee e = ListOfEmployees.get(employeeNumber);
		System.out.println(e);
		System.out.println("\n");
	}
	
	
	
	
	
	
	public void updateEmployee(List<Employee> ListOfEmployees, int employeeNumber) {
		//Iterator<Employee> it = emp.iterator();
		Scanner upEmployee = new Scanner(System.in);
		Employee e = ListOfEmployees.get(employeeNumber);
		System.out.println("UPDATE OPTIONS:\n"
				+ "1. Name\n"
				+ "2. Salary\n"
				+ "3. Address\n");
		int updateOptionNumber = upEmployee.nextInt();
			
		switch(updateOptionNumber) {
			case 1: 
				System.out.println(": NAME :\n");
				System.out.println("Current name: " + e.getEmpName());
				System.out.println("New name: ");
				String newName = upEmployee.nextLine();
				e.setEmpName(newName);
				break;
		
			case 2:
				System.out.println(": SALARY :\n");
				System.out.println(e.getEmpName() + ", " + "Current salary: " + e.getSalary());
				System.out.println("New salary: ");
				Double newSalary = upEmployee.nextDouble();
				e.setSalary(newSalary);
				displayAllEmployees(ListOfEmployees);
				break;
				
			case 3:
				System.out.println(": ADDRESS :\n");
				System.out.println(e.getEmpName() + ", " + "Current location: " + e.getAddress());
				System.out.println("New city: ");
				String newCity = upEmployee.nextLine();
				System.out.println(newCity);
				System.out.println("New state: ");
				String newState = upEmployee.nextLine();
				e.setAddress(new Address(newCity, newState));
				break;
				}	
			}
		
		
	
	
	
	
	
	public void deleteEmployee(List<Employee> ListOfEmployees, int employeeNumber) {
		//Iterator<Employee> it = emp.iterator();
		Scanner deleteEmployee = new Scanner(System.in);
		Employee e = ListOfEmployees.get(employeeNumber);
		System.out.println("Would you like to delete " + e.getEmpName() + "?");
		int deleteE = deleteEmployee.nextInt();
		switch(deleteE) {
		case 1: 
			ListOfEmployees.remove(e);
			break;
		
		case 2:
			break;
		}
	}	
		

	

	
	



}	
				
			

