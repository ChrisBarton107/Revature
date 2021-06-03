package assignment;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// Check whether a letter is vowel of consonant with switch statement
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a character: ");
		char c = scan.next().charAt(0);
		
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':  
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Character is a vowel");
			break;
			
		default: 
			System.out.println("Character is a consonant");
			break;
		}
		
	}

}
