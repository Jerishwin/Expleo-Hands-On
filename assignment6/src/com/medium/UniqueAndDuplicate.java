package com.medium;

import java.util.Scanner;

public class UniqueAndDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		
		int arr[] = new int[n];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) { // input of array elements
			arr[i] = sc.nextInt();
		}
		
		int dupeCount=0,originalCount=n;
		
		for(int i=0;i<n-1;i++) {
					
					if(arr[i]==-1)
						continue;
					
					for(int j=i+1;j<n;j++) {
							
						if(arr[i]==arr[j]){ // counting frequency
							
							dupeCount++;
							originalCount--;
							arr[j]=-1;
						}
					}
				}
				
		System.out.print("\nOriginal: "+originalCount+"\nDuplicate: "+dupeCount);
		sc.close();

	}

}
