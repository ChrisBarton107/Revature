package com;

import java.util.Iterator;
import java.util.logging.Logger;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class EmployeeServiceImpl implements EmployeeService {
	
	static Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());

	
	BufferedReader DataReader = new BufferedReader(new InputStreamReader(System.in));
	
	

	
	
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
		int Update = 0;
		Employee e1 = ListOfEmployees.get(employeeNumber);
		System.out.println("UPDATE OPTIONS:\n"
				+ "1. Name\n"
				+ "2. Salary\n"
				+ "3. Address\n");
		try {
			Update = Integer.parseInt(DataReader.readLine());
		} 
		catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
		catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
		catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
		
		switch(Update) {
			case 1: 
				String Name = null;
				System.out.println(": NAME :\n");
				System.out.println("Current name: " + e1.getEmpName());
				System.out.println("New name: ");
				try {
					Name = DataReader.readLine();
				} 
				catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
				catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
				catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
				e1.setEmpName(Name);
				break;
		
			case 2:
				double NewSalary = 0;
				System.out.println(": SALARY :\n");
				System.out.println(e1.getEmpName() + ", " + "Current salary: " + e1.getSalary());
				System.out.println("New salary: ");
				try {
					NewSalary = Double.parseDouble(DataReader.readLine());
				} 
				catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
				catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
				catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
				e1.setSalary(NewSalary);
				break;
				
			case 3:
				String NewCity = null;
				String NewState = null;
				System.out.println(": ADDRESS :\n");
				System.out.println(e1.getEmpName() + ", " + "Current location: " + e1.getAddress());
				System.out.println("New city: ");
				try {
					NewCity = DataReader.readLine();
				} 
				catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
				catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
				catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
				
				System.out.println(NewCity);
				System.out.println("New state: ");
				try {
					NewState = DataReader.readLine();
				} 
				catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
				catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
				catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
				e1.setAddress(new Address(NewCity, NewState));
				break;
				}	
			}
		
		
	
	
	
	
	
	public void deleteEmployee(List<Employee> ListOfEmployees, int employeeNumber) {
		//Iterator<Employee> it = emp.iterator();
		int DeleteEmployee = 0;
		Employee e1 = ListOfEmployees.get(employeeNumber);
		System.out.println("Would you like to delete " + e1.getEmpName() + "?");
		try {
			DeleteEmployee = Integer.parseInt(DataReader.readLine());
		} 
		catch (NumberFormatException nfe) {LOGGER.log(Level.WARNING, "NumberFormatException");}
		catch (IOException ioe) {LOGGER.log(Level.WARNING, "IOException");}
		catch (IndexOutOfBoundsException ioobe) {LOGGER.log(Level.WARNING, "IndexOutOfBoundsException");}
		
		switch(DeleteEmployee) {
		case 1: 
			ListOfEmployees.remove(e1);
			break;
		
		case 2:
			break;
		}
	}	
		

	


}	
				
			