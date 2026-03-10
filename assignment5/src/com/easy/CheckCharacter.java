package com.easy;
import java.util.Scanner;

/**
 * This class checks whether the
 * given Character is an Alphabet/ Digit /Special Symbol
 */

public class CheckCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char c = sc.next().charAt(0);
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			
			System.out.println("The character is an Alphabet");
			
		}else if(c>='0' && c<='9') {
			
			System.out.println("The character is a Number");
			
		}else {
			
			System.out.println("The character is a Special Character");
		}
		
		sc.close();

	}

}
