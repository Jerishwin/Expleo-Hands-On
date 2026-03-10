package com.easy;
import java.util.*;

/**
 * This class checks whether the blood donor is eligible or not
for donating blood.
 */

public class BloodDonation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Weight ");
		int weight = sc.nextInt();
		
		if(age>18 && age<55 && weight>45) {
			System.out.print("Eligible for Donation");
		}else {
			System.out.print("Not Eligible for Donation");
		}
		
		sc.close();

	}

}
