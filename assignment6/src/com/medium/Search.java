package com.medium;
import java.util.*;

public class Search {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		
		int arr[] = new int[n];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) { // input of array elements
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter element to Search: ");
		int key=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.print(true);
				break;
			}
		}
		System.out.print(false);
		
		sc.close();
	}

}
