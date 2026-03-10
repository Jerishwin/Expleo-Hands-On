package com.medium;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[25];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<25;i++) { // input of array elements
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter element to Search: ");
		int key=sc.nextInt();
		
		int count=0;
		for(int i=0;i<25;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		if(count==0) {
			System.out.print("Element not found");
		}else {
			System.out.print("element found!!\nFreuency: "+count);
		}
		
		sc.close();

	}

}
