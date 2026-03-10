package com.medium;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter Month: ");
			int month = sc.nextInt();
			
			if(month<1||month>12) {
				break;
			}
			
			System.out.print("Enter the day (mon=1, sun=7): ");
			int startDay = sc.nextInt();
			
			int days=0;
			
			switch(month) {
			
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				days=31;
				break;
				
			case 4:case 6:case 9:case 11:
				days=30;
				break;
				
			case 2:
				System.out.print("How many day for February");
				days=sc.nextInt();
				break;
			}
			
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		
		for(int i=1;i<startDay;i++) {
			System.out.print("  ");
		}
		
		for(int i=1;i<=days;i++) {
			
			System.out.printf("%-4d",i);
			
			if((i+startDay-1)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		}
		
		sc.close();
	}

}
