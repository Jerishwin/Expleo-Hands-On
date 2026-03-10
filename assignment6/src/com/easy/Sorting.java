package com.easy;
import java.util.*;

/**
 * This class sorts the elements of an array in sequence.
 */

public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers to sort? ");
		int n=sc.nextInt(); // size of array
		
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) { // input of array elements
			array[i] = sc.nextInt();
		}
		
		// sorting of array using bubble sort
		for(int i=0;i<n-1;i++) { 
			for(int j=i+1;j<n;j++) {
				if(array[j]<array[i]) {
					
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.print("Sorted Array: ");
		for(int i:array) { // printing of sorted array
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
