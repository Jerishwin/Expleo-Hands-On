package com.Practice;
import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Initial array Size: "+arr.size());
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("After Initial array Size: "+arr.size());
		
		System.out.println("Contents of the array: "+arr);
		
		Integer ia[] = new Integer[arr.size()];
		ia = arr.toArray(ia);
		
		int sum = 0;
		
		for(int i:ia) {
			sum+=i;
		}
		
		System.out.println("Sum: "+sum);
	}

}
