package com.medium;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		
		int arr[] = new int[n];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) { // input of array elements
			arr[i] = sc.nextInt();
		}
		
		int k=0;
		int originalArr[]=new int[n];
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]==-1)
				continue;
			
			originalArr[k]=arr[i];
			k++;
			for(int j=i+1;j<n;j++) {
							
				if(arr[i]==arr[j]){ // counting frequency
							
					arr[j]=-1;
				}
			}
			
			
		}
		
		if(arr[n-1]!=-1) {
			originalArr[k]=arr[n-1];
			k++;
		}
		
		System.out.print("Original Array: ");
		for(int i=0;i<k;i++) {
			System.out.print(originalArr[i]+" ");
		}
		
		sc.close();
	}

}
