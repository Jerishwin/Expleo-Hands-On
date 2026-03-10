package com.hard;
import java.util.*;

public class DiceGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arunSum=0,naveenSum=0;
		
		System.out.print("Arun's Dice Choice:  ");
		int arun[] = new int[10];
		
		for(int i=0;i<10;i++) { // input of array elements
			arun[i] = sc.nextInt();
			arunSum+=arun[i];
		}
		
		System.out.print("Arun's Dice Choice:  ");
		int naveen[] = new int[10];
		
		for(int i=0;i<10;i++) { // input of array elements
			naveen[i] = sc.nextInt();
			naveenSum+=naveen[i];
		}
		
		if(naveenSum>arunSum) {
			System.out.print("Naveen Wins!!");
		}else {
			System.out.print("Arun Wins!!");
		}
		
		sc.close();
	}

}
