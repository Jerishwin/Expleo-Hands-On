package com.medium;
import java.util.*;

/**
 * This class calculates bill for Internet browsing
 */
public class InternetBrowsing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the time(H MM): ");
		int hour = sc.nextInt();
		int minute=sc.nextInt();
		
		if(hour>=7) {
			System.out.print("Maximum time reached!\nBill:350 Rs");
		}else if(hour==5&&minute==00) {
			System.out.print("Bill:350 Rs");
		}else {
			System.out.print("Bill: "+((hour*50)+minute)+" Rs");
		}
		
		sc.close();
	}

}
