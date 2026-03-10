package com.easy;

/**
 * This Class Adds even and odd number in a array
 */

public class AddEvenOdd {

	public static void main(String[] args) {
		
		int[] even = new int[] {2,4,6,8};
		int[] odd = new int[] {1,3,5,7,9};
		int evenSum=0,oddSum=0;
		
		for(int i=0;i<even.length;i++) { // sum of even numbers
			evenSum+=even[i];
		}
		
		for(int i=0;i<odd.length;i++) { // sum of odd numbers
			oddSum+=odd[i];
		}
		
		System.out.println("Sum of Even Numbers: "+evenSum);
		System.out.println("Sum of odd Numbers: "+oddSum);
	}

}
