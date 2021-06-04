package assignment;

import java.util.ArrayList;


public class Clone {

	public static void main(String[] args) {
		// Clone an array list
		ArrayList<Integer> Alist = new ArrayList<Integer>();
		Alist.add(1);
		Alist.add(2);
		Alist.add(3);
		Alist.add(4);
		Alist.add(5);
		Alist.add(6);
		Alist.add(7);
		Alist.add(8);
		Alist.add(9);
		Alist.add(10);
		System.out.println(Alist);
	
	ArrayList<Integer> Blist = (ArrayList)Alist.clone();
	System.out.println(Blist);
		
	}

}
