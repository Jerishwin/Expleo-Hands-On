package com.practice;
import java.util.*;

public class TicketBooking {

	public static void main(String[] args) {
		
		String[][] seatType = new String[4][];
		Scanner sc = new Scanner(System.in);
		
		int vip=0,premium=0,regular=0,viptotal=5,premiumTotal=10,regularTotal=5;
		System.out.println("Enter Seats: ");
		
		for(int i=0;i<seatType.length;i++) {
			if(i==0)
				System.out.println("-----VIP SEATS-----");
			
			if(i==1||i==2)
				System.out.println("-----PREMIUM SEATS-----");
			
			if(i==3)
				System.out.println("-----REGULAR SEATS-----");
			String a ="A";
			int j=0;
			while(a!="C") {
				seatType[i][j]=sc.next();
				a=seatType[i][j];
			}
		}
		
		System.out.println("SEAT ARRANGEMENTS: ");
		for(int i=0;i<seatType.length;i++) {
			if(i==0)
				System.out.println("-----VIP SEATS-----");
			
			if(i==1||i==2)
				System.out.println("-----PREMIUM SEATS-----");
			
			if(i==3)
				System.out.println("-----REGULAR SEATS-----");
			
			for(int j=0;j<seatType[i].length;j++) {
				
				System.out.print(seatType[i][j]+" ");
				
				if(i==0&&seatType[i][j].equals("B"))
					vip++;
				
				if((i==1||i==2)&&seatType[i][j].equals("B"))
					premium++;
				
				if(i==3&&seatType[i][j].equals("B"))
					regular++;
				
			}
			
			System.out.println();
		}
		
		System.out.println("SEAT BOOKED DETAILS");
		System.out.println("-----VIP SEATS-----\nBooked: "+vip+"\nAvalible: "+(viptotal-vip));
		System.out.println("-----PREMIUM SEATS-----\nBooked: "+vip+"\nAvalible: "+(premiumTotal-premium));
		System.out.println("-----REGULAR SEATS-----\nBooked: "+vip+"\nAvalible: "+(regularTotal-regular));
		
	}

}
