package assignment;

public class NegativeOrPositive {

	public static void main(String[] args) {
		// Check whether a number is negative or positive
		NegativeOrPositive(-10);

	}

	public static void NegativeOrPositive(int integer) {
		if (integer < 0) {
			System.out.println("Number is negative");
	} 	else if (integer > 0) {
			System.out.println("Number is positive");
	}	else {
			System.out.println("0");
	}
	
	}	



}
