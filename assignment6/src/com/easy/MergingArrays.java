package com.easy;
import java.util.*;

public class MergingArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array 1 Size: ");
		int n=sc.nextInt(); // size of array
		
		int arr1[] = new int[n];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) { // input of array elements
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Array 2 Size: ");
		int m=sc.nextInt(); 
		
		int arr2[] = new int[m];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<m;i++) { 
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int[(n+m)];
		
		 // Copy arr1
        for (int i=0;i<n;i++) {
            arr3[i]=arr1[i];
        }

        // Copy arr2
        for (int i=0;i<m;i++) {
            arr3[n+i]=arr2[i];
        }
		
		System.out.print("\nArray 1: ");
		for(int i:arr1) { // printing of sorted array
			System.out.print(i+" ");
		}
		
		System.out.print("\nArray 2: ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		
		System.out.print("\nArray 3: ");
		for(int i:arr3) { 
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
