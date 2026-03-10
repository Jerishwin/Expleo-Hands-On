package com.medium;
import java.util.*;

/**
 * This class offers a discount of 15% 
 * if the quantity purchased is more than 500. 
 */

public class Discount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr Quantity of Products: ");
		int quantity=sc.nextInt();
		System.out.print("Enetr Retail Amount: ");
		double amount = sc.nextInt();
		
		
		if(quantity>500) {
			double discount = amount*0.15;
			amount-=discount;
		}
		
		System.out.println("Total Expense: "+amount);
		
		sc.close();
	}

}
