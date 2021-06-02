
package main;

import java.util.Scanner;

public class Converter {
	
	// Methods
	
	// Distance
	public static double MilesToKilometers(double quantity) {
		return quantity * 1.609344;
	}
	
	public static double MetersToKilometers(double quantity) {
		return quantity * 0.001;
	}
	
	// Temperature
	public static double CelsiusToFahrenheit(double quantity) {
		return ((quantity * 1.8) + 32);
	}
	
	public static double FahrenheitToCelsius(double quantity) {
		return (quantity - 32) / 1.8;
	}
	
	// Volume
	public static double TeaspoonsToTablespoons(double quantity) {
		return quantity * 0.3333;
	}
	
	public static double TeaspoonsToCups(double quantity) {
		return quantity * 0.02083333;
	}

	
	
	// Main
	public static void main(String[] args) {
		// Menu
		System.out.println("Menu: \n "
					+ "1. Distance \n "
					+ "2. Temperature \n "
					+ "3. Volume \n "
					+ "4. Quit");
					
		// Take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect an option: ");
		int option = scanner.nextInt();
		if (option == 1) {
			System.out.println("Select an option: "
							+ "\n1. Miles to Kilometers"
							+ "\n2. Meters to Kilometers");
							
		} else if (option == 2) {
			System.out.println("Select an option: "
							+ "\n3. Celsius To Fahrenheit"
							+ "\n4. Fahrenheit to Celsius");
							
		} else if (option == 3) {
			System.out.println("Select an option: "
							+ "\n5. Teaspoons to Tablespoons"
							+ "\n6. Teaspoons to Cups");
							
		} else if (option == 4) {
			System.out.println("Quit");
			System.exit(0);
		
		} else if (option != 1 || option != 2 || option != 3) {
			System.out.println("Not an option. Re-run program and try again");
			System.exit(0);
		}
		int option2 = scanner.nextInt();
		
		if (option == 1 & option2 == 1 || option == 1 & option2 == 2){
			System.out.println("--------------------------");
		} else if (option == 1 & option2 != 1 || option == 1 & option2 != 2) {
			System.out.println("Not an option. Re-run program and try again");
			System.exit(0);
		} else if (option == 2 & option2 == 3 || option == 2 & option2 == 4) {
			System.out.println("---------------------------");
		} else if (option == 2 & option2 != 3 || option == 2 & option2 != 4) {
			System.out.println("Not an option. Re-run program and try again");
			System.exit(0);
		} else if (option == 3 & option2 == 5 || option == 3 & option2 == 6) {
			System.out.println("----------------------------");
		} else if (option == 3 & option2 != 5 || option == 3 & option2 != 6) {
			System.out.println("Not an option. Re-run program and try again");
			System.exit(0);
		} else {
			System.out.println("----------------------------");
		}
		
		System.out.println("Quantity to be converted: ");
		double inputQuantity = scanner.nextDouble();
		scanner.close();
		
		
		// Match conversion type and quantity with case
		switch(option2) {
		
		case 1:
			if (option == 1 & option2 == 1) 
			System.out.println(MilesToKilometers(inputQuantity) + " kilometers");
		break;
		
		case 2:
			if (option == 1 & option2 == 2)
			System.out.println(MetersToKilometers(inputQuantity) + " kilometers");
		break;
		
		case 3: 
			if (option == 2 & option2 == 3)
			System.out.println(CelsiusToFahrenheit(inputQuantity) + " degrees fahrenheit");
		break;
		
		case 4:
			if (option == 2 & option2 == 4)
			System.out.println(FahrenheitToCelsius(inputQuantity) + " degrees celsius");
		break;
		
		case 5: 
			if(option == 3 & option2 == 5)
			System.out.println(TeaspoonsToTablespoons(inputQuantity) + " tablespoons");
		break;
		
		case 6:
			if (option == 3 & option2 == 6)
			System.out.println(TeaspoonsToCups(inputQuantity) + " cups");
		break;
		}
	
	}
}
