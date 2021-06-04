package assignment;

import java.util.ArrayList;

public class ArrayJoin {

	public static void main(String[] args) {
		// Join two ArrayLists
		ArrayList <Integer> List1 = new ArrayList<Integer>();
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);
		
		ArrayList <Integer> List2 = new ArrayList<Integer>();
		List1.add(6);
		List1.add(7);
		List1.add(8);
		List1.add(9);
		List1.add(10);
		
		List1.addAll(List2);
		System.out.println(List1);
		
		

	}

}
