package com.medium;
import java.util.*;
/**
 * This class Calculates purchase amount to be paid after discount using if-else. 
 */

public class DiscountIfElse {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int amount = sc.nextInt();
		
		if(amount>1000) {
			System.out.println("Total Amount: "+(amount-amount*0.10));
		}else {
			System.out.println("Total Amount: "+(amount-amount*0.05));
		}
		
		sc.close();
	}

}
