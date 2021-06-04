package assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		// Iterate a LinkedList in reverse order
		
		LinkedList <String> link = new LinkedList <String>();
		link.add("Alaska");
		link.add("Texas");
		link.add("Ohio");
		link.add("Alabama");
		link.add("California");
		link.add("Massachusetts");
		link.add("Michigan");
		link.add("Pennsylvania");
		System.out.println(link);
		
		ListIterator<String> listIterator = link.listIterator(link.size());
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		

	}

}
