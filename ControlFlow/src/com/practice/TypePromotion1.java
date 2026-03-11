package com.practice;

/**
 * The TypePromotion1 class implements
 * the type promotion
 */
public class TypePromotion1 {

	public static void main(String[] args) {
		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 500000;
		float f = 5.67f;
		double d = .1234;
		double result = (f*b)+(i/c)-(d*s); //promote into double
		System.out.println("Result= "+result);
		
	}

}
