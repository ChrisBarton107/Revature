package com;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.lang.IndexOutOfBoundsException;



public class UseEmployee {
	
	static Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
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
		
		BufferedReader MainReader = new BufferedReader(new InputStreamReader(System.in));
		
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
		
			try {
				menuSelection = Integer.parseInt(MainReader.readLine());
			} 
			catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
			catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
			catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			
		switch(menuSelection) {
		 case 1: 
			 System.out.println(":: EMPLOYEE DATA ::\n");
			 esInterface.displayAllEmployees(employeeAL);
			 break;
			 
		 case 2: 
			 int FinderNumber = 0;
			 System.out.println(":: EMPLOYEE FINDER ::\n"
			 		+ "Enter employee number: ");
			 try {
				 FinderNumber = Integer.parseInt(MainReader.readLine());
				 esInterface.findByEmployeeNo(employeeAL, FinderNumber);
			 }
			 catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
			 catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
			 catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			 break;
		
		 case 3:
			 int FinanceNumber = 0;
			 System.out.println(":: FINANCE ::\n"
			 		+ "Enter employee number: ");
			 try {
				 FinanceNumber = Integer.parseInt(MainReader.readLine());
				 esInterface.calculateYearlySalary(employeeAL, FinanceNumber);
			 }
			 catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
			 catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
			 catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			 break;
		
		 case 4: 
			 int UpdateNumber = 0;
			 System.out.println(":: UPDATE EMPLOYEE ::\n"
			 		+ "Enter employee number: ");
			 try {
				 UpdateNumber = Integer.parseInt(MainReader.readLine());
				 esInterface.updateEmployee(employeeAL, UpdateNumber);
			 }
			 catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
			 catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
			 catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
			 break;
	
		 case 5: 
			int DeleteNumber = 0;
			System.out.println(":: DELETE EMPLOYEE ::\n"
					+ "Enter employee number: ");
			try {
				DeleteNumber = Integer.parseInt(MainReader.readLine());
				esInterface.deleteEmployee(employeeAL, DeleteNumber);
			}
			catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
			catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
			catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
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









