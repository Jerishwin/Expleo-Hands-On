package com.easy;
import java.util.*;

/**
 * This class Finds if the 
 * entered number is a divisor of 7
 */

public class DivisorOfSeven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		if(n%7==0) {
			System.out.println("The Number "+n+" is a divsor of 7");
		}
		
		sc.close();
	}
}
