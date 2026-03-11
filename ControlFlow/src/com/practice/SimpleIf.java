package com.practice;
import java.util.Scanner;

/**
 * this class implements to check the availability
 * for the movie ticket booking using simple if
 */

public class SimpleIf {

	public static void main(String[] args) {
		
		boolean seatAvalible = true;               //Seat Available Status
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Seat Number: ");
		String seatNumber = sc.next();            // get seat number
		
		if(seatAvalible) {
			System.out.println("you have registered seat: "+seatNumber);
		}
		
		sc.close();

	}

}
