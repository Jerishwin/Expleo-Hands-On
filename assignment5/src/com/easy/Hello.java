package com.easy;
import java.util.*;

/**
 * This Class prints hello if the integer is positive if 
 * not then the program stops and shows the number of hello
 */

public class Hello {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		do {
			int n = sc.nextInt();
			
			if(n>=0) { // checks the integer
				System.out.println("Hello!");
				i++;
			}else {
				break; //breaks loop if integer is negative
			}
		}while(true);
		
		System.out.print("Number of Hello: "+i);
		
		sc.close();
		
	}
}
