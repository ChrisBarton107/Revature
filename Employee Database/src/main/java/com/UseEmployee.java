package com;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.lang.IndexOutOfBoundsException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.logging.Level;

public class UseEmployee {
	
	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
	public static EmployeeServiceImpl esInterface = new EmployeeServiceImpl();
	
	protected static List<Employee> employeeAL = new ArrayList<Employee>() {
			{
			{
			add(new Employee(0, "Carol Burns", 60000.00, new Address("Twinsburg", "Ohio")));
			add(new Employee(1, "John Smith", 50000.00, new Address("Atlanta", "Georgia")));
			add(new Employee(2, "Nathan Bates", 55000.00, new Address("Los Angeles", "California")));
			add(new Employee(3, "Harry Turner", 45000.00, new Address("Albany", "New York")));
			add(new Employee(4, "Sam Liptak", 65000.00, new Address("Akron", "Ohio")));
			add(new Employee(5, "Brad Williams", 68000.00, new Address("Columbus", "Ohio")));
			add(new Employee(6, "Angela Lee", 53000.00, new Address("Montgomery", "Alabama")));
			add(new Employee(7, "Natalie Richards", 75000.00, new Address("San Francisco", "California")));
			add(new Employee(8, "Bill Donaldson", 48000.00, new Address("Buffalo", "New York")));
			add(new Employee(9, "Don Stevenson", 67000.00, new Address("Miami", "Florida")));
			add(new Employee(10, "Tom White", 70000.00, new Address("San Diego", "California")));
			}
			
		};
		};

	
		
	public static void main(String[] args) {
		
		LOGGER.info("Logger Name: " + LOGGER.getName());
		LOGGER.warning("Exceptions may occur");
		
		Scanner scan = new Scanner(System.in);
		
		int menuSelection = 0;
		
		System.out.println(":::: EMPLOYEE DATABASE ::::\n");
		
		while(true) {
			System.out.println("SELECT ONE OF THE FOLLOWING OPTIONS\n"
					+ "1. All Employee Data\n"
					+ "2. Employee Finder\n"
					+ "3. Financial\n"
					+ "4. Update\n"
					+ "5. Delete\n"
					+ "6. Exit");
		
		menuSelection = scan.nextInt();
		
		switch(menuSelection) {
		 case 1: 
			 System.out.println(":: EMPLOYEE DATA ::");
			 esInterface.displayAllEmployees(employeeAL);
			 break;
			 
		 case 2: 
			 System.out.println(":: EMPLOYEE FINDER ::");
			 System.out.println("Enter employee number: ");
			 try {
			 int empNumber = scan.nextInt();
			 esInterface.findByEmployeeNo(employeeAL, empNumber);
			 }
			 catch(IndexOutOfBoundsException e) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			 catch(InputMismatchException e) {LOGGER.log(Level.WARNING, "InputMismatchException");}
			 catch(NoSuchElementException e) {LOGGER.log(Level.WARNING, "NoSuchElementException");}
			 break;
			 
		 case 3:
			 System.out.println(":: FINANCE ::");
			 System.out.println("Enter employee number: ");
			 try {
			 int empNumber2 = scan.nextInt();
			 esInterface.calculateYearlySalary(employeeAL, empNumber2);
			 }
			 catch(IndexOutOfBoundsException e) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			 catch(InputMismatchException e) {LOGGER.log(Level.WARNING, "InputMismatchException");}
			 catch(NoSuchElementException e) {LOGGER.log(Level.WARNING, "NoSuchElementException");}
			 break;
			 
		 case 4: 
			 System.out.println(":: UPDATE EMPLOYEE ::");
			 System.out.println("Enter employee number ");
			 try {
			 int empNumber3 = scan.nextInt();
			 esInterface.updateEmployee(employeeAL, empNumber3);
			 }
			 catch(IndexOutOfBoundsException e) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			 catch(InputMismatchException e) {LOGGER.log(Level.WARNING, "InputMismatchException");}
			 catch(NoSuchElementException e) {LOGGER.log(Level.WARNING, "NoSuchElementException");}
			 break;
			 
		 case 5: 
			System.out.println(":: DELETE EMPLOYEE ::\n");
			System.out.println("Enter employee number: ");
			try {
			int empNumber4 = scan.nextInt();
			esInterface.deleteEmployee(employeeAL, empNumber4);
			}
			catch(IndexOutOfBoundsException e) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			catch(InputMismatchException e) {LOGGER.log(Level.WARNING, "InputMismatchException");}
			catch(NoSuchElementException e) {LOGGER.log(Level.WARNING, "NoSuchElementException");}
			break;
				 
		 case 6: 
			System.out.println("Exit");
			System.exit(0);
			
		default:
			LOGGER.log(Level.WARNING, "Invalid input");
			break;
		 }
		
		}
			



	}




}
	
	
	
	
	

	




