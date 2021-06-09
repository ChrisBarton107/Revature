package com;


import java.util.Scanner;
import java.util.logging.Logger;


public class UseEmployee {
	
	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());

	public static void main(String[] args) {
		
		LOGGER.info("Logger Name: " + LOGGER.getName());
		
		LOGGER.warning("Exceptions may occur");
		
		
		
		// Employee service interface
		EmployeeServiceImpl esInterface = new EmployeeServiceImpl();
		
		int menuSelection = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(":::: EMPLOYEE DATABASE ::::\n");
		
		while(true){
			System.out.println("SELECT ONE OF THE FOLLOWING OPTIONS\n"
					+ "1. All Employee Data\n"
					+ "2. Employee Finder\n"
					+ "3. Financial\n"
					+ "4. Update\n"
					+ "5. Delete\n"
					+ "6. Quit");
			  
		menuSelection = scan.nextInt();
		switch(menuSelection) {
		 case 1: 
			 System.out.println(":: EMPLOYEE DATA ::");
			 esInterface.displayAllEmployees();
			 break;
			 
		 case 2: 
			 System.out.println(":: EMPLOYEE FINDER ::");
			 esInterface.findByEmployeeNo();
			 break;
			 
		 case 3:
			 System.out.println(":: FINANCE ::");
			 esInterface.calculateYearlySalary();
			 break;
			 
		 case 4: 
			 System.out.println(":: UPDATE EMPLOYEE ::");
			 esInterface.updateEmployee();
			 break;
			 
		 case 5: 
			System.out.println(":: DELETE EMPLOYEE ::\n");
			esInterface.deleteEmployee();
			break;
				 
		 case 6: 
			System.exit(0);
			
		default:
			System.out.println("Invalid input");
			break;
		 }
	}


	}

}


