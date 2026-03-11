package com.practice;
import java.util.*;

public class IfElseIf {

	public static void main(String[] args) {
		
		String seatType;
		System.out.print("Type of Seats Avaliple\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nChoose any one: ");
		Scanner sc = new Scanner(System.in);
		
		seatType = sc.next();
		
		if(seatType.equals("REGULAR")) {
			System.out.println("You have selected Regular seats and costs 80Rs.");
		}if(seatType.equals("PREMIUM")) {
			System.out.println("You have selected Premium seats and costs 100Rs.");
		}if(seatType.equals("EXECUTIVE")) {
			System.out.println("You have selected Executive seats and costs 120Rs.");
		}if(seatType.equals("VIP")) {
			System.out.println("You have selected Vip seats and costs 150Rs.");
		}else {
			System.out.println("You have not selected any type");
		}
		
		sc.close();
	}

}
