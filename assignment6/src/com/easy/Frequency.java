package com.easy;
import java.util.Scanner;

/**
 * This Class finds the frequency of each element in the array
 */

public class Frequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		System.out.print("Enter the Elements: ");
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) { // input of array elements
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			
			if(array[i]==-1)
				continue;
			
			int count =1;
			
			for(int j=i+1;j<n;j++) {
				
					
				if(array[i]==array[j]){ // counting frequency
					
					count++;
					array[j]=-1;
				}

			}
			
			System.out.println(array[i]+"'s frequency is "+count);
			
		}
		
		if(array[n-1]!=-1) {
			System.out.println(array[n-1]+"'s frequency is 1");
		}
		
		sc.close();
	}

}
