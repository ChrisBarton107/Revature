package assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci series with a for loop
		
		int max = 9;
		int prevNumber = 0;
		int nextNumber = 1;
		
		for (int i = 1; i <= max; ++i) {
			int sum = prevNumber + nextNumber;
			prevNumber = nextNumber;
			nextNumber = sum;
			System.out.println(sum);
			
		}

	}

}
