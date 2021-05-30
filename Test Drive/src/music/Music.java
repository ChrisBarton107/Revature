package music;

import java.util.Scanner;

public class Music {
	
	public Music() {}
	
	
	public void Spotify (String[] spotifyStations) {
		
		System.out.println(":: SPOTIFY ::");
		
		for (String station : spotifyStations) {
			System.out.println(station.toString());
		}
		Scanner spot = new Scanner(System.in);
		String spotSelection = spot.nextLine();
		System.out.println("Playing " + spotSelection);
		spot.close();
		}
		
	
	
	public void Pandora(String[] pandoraStations) {
		
		System.out.println(":: PANDORA ::");
		
		for (String station : pandoraStations) {
			System.out.println(station);
		}
		Scanner pand = new Scanner(System.in);
		String pandSelection = pand.nextLine();
		System.out.println("Playing " + pandSelection);
		pand.close();
	}
	
	
	public void YouTube(String[] youtubeStations) {
		
		System.out.println(":: YOUTUBE ::");
		
		for (String station : youtubeStations) {
			System.out.println(station);
		}
		Scanner you = new Scanner(System.in);
		String youSelection = you.nextLine();
		System.out.println("Playing " + youSelection);
		you.close();
	}

}
