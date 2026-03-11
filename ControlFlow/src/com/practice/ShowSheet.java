package com.practice;

public class ShowSheet {
	public static void main(String[] args) {
		
		int MaxSeat = 5,seatcount=0;
		
		do {
			System.out.println("Current Seat Avalibility: "+(MaxSeat-seatcount));
			seatcount++;
		}while(seatcount<MaxSeat);
		System.out.println("Seats are filled");
	}

}
