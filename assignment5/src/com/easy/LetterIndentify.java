package com.easy;
import java.util.*;

/**
 * This Class recognize the entered
 * character as vowel, consonant or symbol
 */

public class LetterIndentify {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char c = sc.next().charAt(0);
		
		switch (c){ //Switch for control flow
		
		case 'a': case 'e': case'i': case'o': case'u':
			System.out.println("The Character is a Vowel");
			break;
			
		case '@': case'-': case'$': case'%':
			System.out.println("The Character is a Symbol");
			break;
			
		default:
			System.out.println("The Character is a Consonant");
		}
		
		sc.close();

	}

}
