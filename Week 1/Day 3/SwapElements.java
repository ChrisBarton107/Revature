package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElements {

	public static void main(String[] args) {
		// Swap positions in an ArrayList with strings
		ArrayList<String> List = new ArrayList<String>();
		List.add("Soccer");
		List.add("Football");
		List.add("Tennis");
		List.add("Basketball");
		List.add("Wrestling");
		List.add("Golf");
		System.out.println(List);
		
		Collections.swap(List, 3, 5);
		System.out.println(List);
		
		// Swap positions in an ArrayList with integers
		ArrayList<Integer> List2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(List2);
		
		Collections.swap(List2, 0, 9);
		System.out.println(List2);
		
	}

}
