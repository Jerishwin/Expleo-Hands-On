package com.easy;
import java.util.*;

/**
 * This Class prints sum of digits of a given number
 */

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number");
		int n = sc.nextInt();
		int sum=0;
		
		while(n!=0) {
			int temp = n%10;
			n/=10;
			sum+=temp;
		}
		
		System.out.println("Sum of Digits: "+sum);
		
		sc.close();
	}

}
