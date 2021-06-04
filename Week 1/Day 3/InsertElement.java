package assignment;

import java.util.LinkedList;

public class InsertElement {

	public static void main(String[] args) {
		
		// Insert specified element as the last element in a LinkedList
		LinkedList <String> newList = new LinkedList <String>();
		newList.add("Lamborghini");
		newList.add("Ferrari");
		newList.add("Maserati");
		newList.add("BMW");
		newList.add("Porsche");
		newList.add("Jaguar");
		newList.add("McClaren");
		newList.add("Mercedes");
		System.out.println(newList);
		
		newList.offerLast("Bugatti");
		System.out.println(newList);

	}

}
