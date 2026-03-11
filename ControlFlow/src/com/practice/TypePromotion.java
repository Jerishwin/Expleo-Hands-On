package com.practice;

/**
 * The TypePromotion class implements
 * the type promotion
 */
public class TypePromotion {

	public static void main(String[] args) {
		
		byte b = 50;
		b = (byte)(b*2); //promote to int
		System.out.println(b);
	}

}
