package com.hard;
import java.util.*;

public class FestivalDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Total Amount: ");
		double purchaseAmount = sc.nextInt();
		double discount;
		
		if(purchaseAmount<2000) {
			discount=purchaseAmount*0.05;
		}else if(purchaseAmount<5000) {
			discount=purchaseAmount*0.25;
		}else if(purchaseAmount<10000) {
			discount=purchaseAmount*0.35;
		}else {
			discount=purchaseAmount*0.5;
		}
		
		System.out.println("The Amount to be paid: "+(purchaseAmount-discount));
		
		sc.close();
	}

}
