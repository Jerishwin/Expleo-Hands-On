package com.hard;

import java.util.Scanner;

public class IndianNRIForegin {

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
		
		System.out.print("Array 2 Size: ");
		int o=sc.nextInt(); 
		
		int arr3[] = new int[o];
		System.out.print("Enter the Elements: ");
		for(int i=0;i<o;i++) { 
			arr3[i] = sc.nextInt();
		}
		
		int sortedArr[] = new int[(n+m+o)];
		
		 // Copy arr1
        for (int i=0;i<n;i++) {
            sortedArr[i]=arr1[i];
        }

        // Copy arr2
        for (int i=0;i<m;i++) {
            sortedArr[n+i]=arr2[i];
        }
        
        for (int i=0;i<o;i++) {
            sortedArr[n+m+i]=arr3[i];
        }
		
        for(int i=0;i<sortedArr.length;i++) { 
			for(int j=i+1;j<sortedArr.length;j++) {
				if(sortedArr[j]<sortedArr[i]) {
					
					int temp=sortedArr[i];
					sortedArr[i]=sortedArr[j];
					sortedArr[j]=temp;
				}
			}
		}
		
		
		System.out.print("\nSorted Array: ");
		for(int i:sortedArr) { 
			System.out.print(i+" ");
		}
		
		sc.close();

	}

}
