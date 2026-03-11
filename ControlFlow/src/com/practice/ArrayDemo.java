package com.practice;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0]="Dhivesh";
		names[1]="Adithya";
		names[2]="Kumar";
		
		for(String name:names) {
			System.out.print(name+"\n");
		}

	}

}
