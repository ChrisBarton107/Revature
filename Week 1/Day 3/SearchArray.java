package assignment;

import java.util.ArrayList;

public class SearchArray {

	public static void main(String[] args) {
		// Search for an element in an ArrayList
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		array.add(11);
		array.add(12);
		System.out.println(array);
		
		int index = array.indexOf(7);
		System.out.println(index);
		
		ArrayList <String> array2 = new ArrayList<String>();
		array2.add("Argentina");
		array2.add("Brazil");
		array2.add("Canada");
		array2.add("USA");
		array2.add("South Africa");
		array2.add("England");
		array2.add("Germany");
		array2.add("France");
		System.out.println(array2);
		
		int index2 = array2.indexOf("USA");
		System.out.println(index2);

	}

}
