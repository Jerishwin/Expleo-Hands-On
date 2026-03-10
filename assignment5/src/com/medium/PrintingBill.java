package com.medium;
import java.util.*;

public class PrintingBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Pages for typing: ");
		int page=sc.nextInt();
		System.out.print("Enter Number of copys: ");
		int copy=sc.nextInt();
		
		int totalCost=page*3;
		
		if(copy==1) {
			totalCost+=page;
		}else {
			totalCost*=(copy-1);
			totalCost+=page;
		}
		
		System.out.print("Total Cost: "+totalCost);
		
		sc.close();
	}

}
