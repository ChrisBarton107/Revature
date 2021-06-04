package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablePlayerTest {

	public static void main(String[] args) {
		
		// Testing player with comparable interface
		
		ArrayList<ComparablePlayer> playerTable = new ArrayList<ComparablePlayer>();
		playerTable.add(new ComparablePlayer("Richard", 30, 25));
		playerTable.add(new ComparablePlayer("Justin", 23, 14));
		playerTable.add(new ComparablePlayer("Michael", 21, 40));
		playerTable.add(new ComparablePlayer("Heath", 35, 37));
		playerTable.add(new ComparablePlayer("John", 41, 24));
		playerTable.add(new ComparablePlayer("Luke", 19, 28));
		playerTable.add(new ComparablePlayer("Chris", 25, 20));
		playerTable.add(new ComparablePlayer("Jason", 50, 36));
		playerTable.add(new ComparablePlayer("Cameron", 42, 41));
		playerTable.add(new ComparablePlayer("George", 20, 5));
		playerTable.add(new ComparablePlayer("Leon", 41, 33));
		playerTable.add(new ComparablePlayer("Robert", 26, 29));
		
		Collections.sort(playerTable);
		for (ComparablePlayer p : playerTable)
			System.out.println(p.name + " " + p.age + " " + p.ranking);


	}

}
