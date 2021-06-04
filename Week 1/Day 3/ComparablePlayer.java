package assignment;

public class ComparablePlayer implements Comparable<ComparablePlayer> {
	String name;
	int age;
	int ranking;
	
	ComparablePlayer(String name, int age, int ranking) {
		this.name = name;
		this.age = age;
		this.ranking = ranking;
	}
	
	public int compareTo(ComparablePlayer player) {
		if(ranking==player.ranking)
		return 0;
		else if (ranking > player.ranking)
		return 1;
		else
		return -1;
	}
}
