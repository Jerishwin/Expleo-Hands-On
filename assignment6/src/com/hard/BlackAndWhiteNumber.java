package com.hard;
import java.util.*;

public class BlackAndWhiteNumber {
	
	public static void processArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%7==0&&arr[i]%8==0)
				arr[i]=-6;
			else if(arr[i]%7==0)
				arr[i]=-2;
			else if(arr[i]%8==0)
				arr[i]=-9;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int count=0;
		
		while (true) {
			int num = sc.nextInt();
			if(num<0) {
				break;
			}
			arr[count++]=num;
		}
		
		int[]finalArr=new int[count];
		
		for(int i=0;i<count;i++) {
			finalArr[i]=arr[i];
		}
		
		processArray(finalArr);
		
		System.out.print("Processed Array: ");
		for(int i:finalArr) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
