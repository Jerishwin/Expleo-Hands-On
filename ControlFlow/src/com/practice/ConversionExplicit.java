package com.practice;

/**
 * The ConversionExplicit class implements the
 * explicit type conversion
 */

public class ConversionExplicit {

	public static void main(String[] args) {
		
		double d = 1000.4;
		long l = (long)d; //explicit conversion
		int i = (int)l; //explicit conversion
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
	}

}
