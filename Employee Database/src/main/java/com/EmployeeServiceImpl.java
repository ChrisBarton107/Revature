package com;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.InputMismatchException;
import java.util.NoSuchElementException;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class EmployeeServiceImpl implements EmployeeService {

	private static ArrayList<Employee> employeeAL = new ArrayList<Employee>() {
		{
		{
		add(new Employee(1, "Carol Burns", 60000.00, new Address("Twinsburg", "Ohio")));
		add(new Employee(2, "John Smith", 50000.00, new Address("Atlanta", "Georgia")));
		add(new Employee(3, "Nathan Bates", 55000.00, new Address("Los Angeles", "California")));
		add(new Employee(4, "Harry Turner", 45000.00, new Address("Albany", "New York")));
		add(new Employee(5, "Sam Liptak", 65000.00, new Address("Akron", "Ohio")));
		add(new Employee(6, "Brad Williams", 68000.00, new Address("Columbus", "Ohio")));
		add(new Employee(7, "Angela Lee", 53000.00, new Address("Montgomery", "Alabama")));
		add(new Employee(8, "Natalie Richards", 75000.00, new Address("San Francisco", "California")));
		add(new Employee(9, "Bill Donaldson", 48000.00, new Address("Buffalo", "New York")));
		add(new Employee(10, "Don Stevenson", 67000.00, new Address("Miami", "Florida")));
		}
		
	};
	};

	
	
	public void displayAllEmployees() {
		// Displays all employee data with a stream
		employeeAL.stream()
			.map(employee -> employee)
			.forEach(System.out::println);
	}
		


	
	public void calculateYearlySalary() {
		try {
		System.out.println("Enter employee number");
		Scanner sal = new Scanner(System.in);
		int num = sal.nextInt();
		for (Employee employee : employeeAL) {
			if(employee.getEmpNo() == num) {
				System.out.println(employee.getEmpName()+","+ " $" + employee.getSalary());
			}		
		}	
		}catch(NoSuchElementException e) {
			System.out.println("NoSuchElementException");
			}
	}
			
		
	
	
	
	
	public void findByEmployeeNo() {
		try {
		System.out.println("Enter employee number");
		Scanner employeeNumber = new Scanner(System.in);
		int input = employeeNumber.nextInt();
		for (Employee employee : employeeAL) {
			if (employee.getEmpNo() == input) {
				System.out.println(employee.getEmpNo()+", "+ employee.getEmpName());
			}
		}
		}catch(NoSuchElementException e) {
			System.out.println("NoSuchElementException");
		}
	}

	
	
	
	public void updateEmployee() {
		try {
		System.out.println("Enter employee number ");
		Scanner update = new Scanner(System.in);
		int updateEmployee = update.nextInt();
		for(Employee employee : employeeAL) {
			if (employee.getEmpNo() == updateEmployee) {
				System.out.println(employee.getEmpName());
				System.out.println("UPDATE OPTIONS:\n"
						+ "1. Name\n"
						+ "2. Salary\n"
						+ "3. Address\n");
				Scanner upEmployee = new Scanner(System.in);
				int updateOptionNumber = upEmployee.nextInt();
			
				switch(updateOptionNumber) {
				case 1: 
					System.out.println(": NAME :\n");
					System.out.println("Current name: " + employee.getEmpName());
					System.out.println("New name:");
					String newName = upEmployee.nextLine();
					employee.setEmpName(newName);
					break;
		
				case 2:
					System.out.println(": SALARY :\n");
					System.out.println(employee.getEmpName() + ", " + "Current salary: " + employee.getSalary());
					System.out.println("New salary:");
					Double newSalary = upEmployee.nextDouble();
					employee.setSalary(newSalary);
					break;
				
				case 3:
					System.out.println(": ADDRESS :\n");
					System.out.println(employee.getEmpName() + ", " + "Current location: " + employee.getAddress());
					System.out.println("New city:");
					String newCity = upEmployee.nextLine();
					System.out.println(newCity);
					System.out.println("New state:");
					String newState = upEmployee.nextLine();
					employee.setAddress(new Address(newCity, newState));
					break;
				}	
			}
		}
		}catch(NoSuchElementException e) {
			System.out.println("NoSuchElementException");
		}
		
	}
	
	
	
	
	public void deleteEmployee() {
		try {
		System.out.println("Enter employee number");
		Scanner deleteEmp = new Scanner(System.in);
		Iterator<Employee> it = employeeAL.iterator();
		int number = deleteEmp.nextInt();
		while(it.hasNext()) {
			Employee employee = it.next();
			if(employee.getEmpNo() == number) {
				System.out.println("Would you like to delete " + employee.getEmpName() + "?");
				String decision = deleteEmp.nextLine();
				decision = decision.toUpperCase();
				switch(decision) {
				case "YES":
					it.remove();
					break;
				case "NO": 
					System.out.println("Return");
					break;
				}
			}
		}
		}catch(NoSuchElementException e) {
				System.out.println("NoSuchElementException");
			}
	}
		
		
		
		


	
}	
				
			

