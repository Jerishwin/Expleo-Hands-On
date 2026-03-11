package com.practice;

public class JaggedArray {

	public static void main(String[] args) {
		
		int bookNo[][] = new int[3][];
		
		bookNo[0]= new int[]{1,2,3};
		bookNo[1]= new int[]{4,5};
		bookNo[2]= new int[]{6,7,8,9};
		
		for(int i[]:bookNo) {
			for(int j:i) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
