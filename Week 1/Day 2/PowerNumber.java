package assignments;

public class PowerNumber {

	public static void main(String[] args) {
		// Number raised to a power 
		int number = 10;
		int power = 5;
		long result = 1;
		
		for (int i = 0; i < power; i++) {
			result *= number;
		}
		System.out.println(number + " to the " + power + " power" + " = " + result);
	}

}
