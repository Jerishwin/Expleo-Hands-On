package com.hard;

import java.util.Scanner;

public class DividingChocolate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		System.out.print("Enter the Elements: ");
		int X[] = new int[n];
		
		for(int i=0;i<n;i++) { // input of array elements
			X[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=X[i];
		}
		
		if(sum%n==0) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}
		
		sc.close();
		
	}

}
