package com.hard;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int fact=1;
		int i=1;
		
		if(n<=0) {
			
			System.out.println("Invaild Input");
			
			sc.close();
			return;
		}
		
		while(n>fact) {
			fact*=i;
			i++;
		}
		
		if(fact==n) {
			System.out.println(i-1);
		}else {
			System.out.println("Sorry. The given number is not a perfect factorial");
		}
		
		sc.close();
	}

}
