package com.easy;
import java.util.*;

/**
 * This class finds max or min value in an array of primitives 
 */

public class MinMax {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		int n=sc.nextInt(); // size of array
		
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) { // input of array elements
			array[i] = sc.nextInt();
		}
		
		int min=array[0],max=array[0];
		
		for(int i=1;i<n;i++) {
			
			if(min>array[i]) //finding minimum
				min=array[i];
			
			if(max<array[i]) //finding maximum
				max=array[i];
		}
		
		System.out.print("Max: "+max+"\nMin: "+min);
		
		sc.close();
	}

}
