package com.easy;
import java.util.Scanner;

public class DublicateNumbers {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		
		
		int array[] = new int[n];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) { // input of array elements
			array[i] = sc.nextInt();
		}
		
		System.out.print("Duplicate Elements: ");
		for(int i=0;i<n-1;i++) {
			
			if(array[i]==-1)
				continue;
			
			for(int j=i+1;j<n;j++) {
				
					
				if(array[i]==array[j]){ 
					
					System.out.println(array[j]); // printing the duplicate values
					array[j]=-1;
				}

			}	
		}
		
		sc.close();
	}

}
