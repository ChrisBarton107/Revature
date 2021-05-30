package game;

import java.util.Scanner;
import music.Music;

import automobile.Lamborghini;
import player.Person;


public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		// Greeting
		System.out.println("::::::::::::\n"
				+ "Lamborghini\n"
				+ "::::::::::::");
		System.out.println("\nWelcome!\n"
				+ "Enter your name: ");
		String input = scan.nextLine();
		System.out.println("Nice to meet you, " + input.toUpperCase() + "." 
				+ "\nSelect one of the following options");
		

		// Main aspect of the program
		LamborghiniOptions();
		String model = scan.nextLine();
		model = model.toUpperCase();
		switch(model) {
		case "URUS":
			Urus();
			break;
		case "AVENTADOR":
			Aventador();
			break;
		case "HURACAN":
			Huracan();
			break;
		case "MURCIELAGO":
			Murcielago();
			break;
		case "GALLARDO": 
			Gallardo();
			break;
		default:
			System.exit(0);
			break;
		
	}
		
		Lamborghini Test = new Lamborghini();
		Person Customer = new Person();
		
		//Test Drive? Yes/No
		System.out.println("Test drive? Yes/No");
		String answer = scan.next();
		answer = answer.toUpperCase();
		switch(answer) {
		case "YES":
			System.out.println("Let's go for a drive!");
			Customer.Walk();
			Customer.OpenDoor();
			Test.OpenCarDoor();
			Test.Ignition();
			Test.Run();
			Test.Driving();
			break;
		
		case "NO":
			System.out.println("Come back if you change your mind");
			System.exit(0);
			break;
		}
		
		
		Music Radio = new Music();
		String[] pandoraStations = {"PandoraJazz", "PandoraCountry", "PandoraClassical"};
		String[] youtubeStations = {"HitMix", "YouTubeMostPlayed", "PopMix"};
		String[] spotifyStations = {"SpotifyRock", "SpotifyCountry", "SpotifyPop"};
		
		
		System.out.println("\nSelect a platform\nSpotify\nPandora\nYouTube\n");
		String musicOption = scan.next();
		musicOption = musicOption.toUpperCase();
		switch(musicOption) {
		case "PANDORA":
			Radio.Pandora(pandoraStations);
			break;
		case "YOUTUBE":
			Radio.YouTube(youtubeStations);
			break;
		case "SPOTIFY":
			Radio.Spotify(spotifyStations);
			break;
		}
		
		
		scan.close();
		System.exit(0);
}

	
	
	
	// Menu of options
	public static void LamborghiniOptions() {
		System.out.println("-------------------\n"
				+ "Lamborghini Models \n"
				+ "-------------------\n"
				+ "Urus \n"
				+ "Aventador \n"
				+ "Huracan \n"
				+ "Murcielago \n"
				+ "Gallardo \n"
				+ "\nQuit"
				+ "\n-------------------\n");
	}
	
	public static void Urus() {
		System.out.println("Urus \n"
				+ "Lamborghini Urus is the first Super Sport Utility Vehicle \n"
				+ "in the world to merge the soul of a super sports car with the \n"
				+ "functionality of an SUV. Powered by a 4.0-liter twin-turbo V8 engine \n"
				+ "producing 650 CV and 850 Nm of torque, Urus accelerates from 0 to 62 \n"
				+ "mph in 3.6 seconds and reaches a top speed of 190 mph.");
		}
	
	public static void Aventador() {
		System.out.println("Aventador \n"
				+ "Each and every detail of the Aventador bears the hallmarks of the \n"
				+ "House of the Raging Bull. It is a true masterpiece of design that \n"
				+ "expresses dynamism and power, with the carbon-fiber monocoque the \n"
				+ "jewel in its crown. The interior combines high-level technology and \n"
				+ "luxury equipment, crafted by skilled artisans using");
		}
	
	public static void Huracan() {
		System.out.println("Huracan \n"
				+ "The Lamborghini Huracán is the perfect fusion of technology and design. \n"
				+ "With its crisp, streamlined lines, designed to cut through the air and \n"
				+ "tame the road, you’ll get a thrill just by looking at it. The only thing \n"
				+ "better than taking in this beauty from a distance is actually touching it.");
		}
	
	public static void Murcielago() {
		System.out.println("Murcielago \n"
				+ "The Lamborghini Murciélago is a sports car produced by Italian automotive \n"
				+ "manufacturer Lamborghini between 2001 and 2009. Successor to the Diablo \n"
				+ "and flagship V12 of the automaker's lineup, the Murciélago was introduced \n"
				+ "as a coupé in 2001. The car was first available in North America for the \n"
				+ "2002 model year.");
		}
	
	public static void Gallardo() {
		System.out.println("Gallardo \n"
				+ "The Lamborghini Gallardo is a sports car built by the Italian automotive \n"
				+ "manufacturer Lamborghini from 2003 to 2013. It is Lamborghini's best-selling \n"
				+ "model with 14,022 built throughout its production run. Named after a famous \n"
				+ "breed of fighting bull, the V10 powered Gallardo has been Lamborghini's sales \n"
				+ "leader and stable-mate to a succession of V12 flagship models—first to the \n"
				+ "Murciélago (4,099 built between 2001 and 2010), then to the current flagship, \n"
				+ "the Aventador.");
		}
	
}

