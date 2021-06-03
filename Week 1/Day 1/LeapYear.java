package assignment;

public class LeapYear {

	public static void main(String[] args) {
		// Check if a given year is a leap year
		LeapYear(1992);
	
	}
	
	public static void LeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("The year " + year + " is a leap year");
	} 	else {
			System.out.println("Not a leap year");
	}
	
	
	
	}
	
}
