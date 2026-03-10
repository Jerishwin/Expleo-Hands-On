package com.easy;

/**
 * This class prints alphabets in a opposite pattern
 */

public class OppoSitAlphabets {

	public static void main(String[] args) {
		
		for(int i=0;i<26;i++) {
			
			System.out.print((char)('a'+i)+""+(char)('z'-i)+" ");
		}

	}

}
