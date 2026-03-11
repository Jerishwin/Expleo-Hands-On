package com.HandsOn;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean[] seen = new boolean[256];
		String result="";
		
		System.out.println("Enter the String: ");
		String str = new String(sc.nextLine());
		
		String strr = str.toLowerCase();
		
		for(int i=0;i<str.length()-1;i++) {
			char c = strr.charAt(i);
			if(!seen[c]) {
				result +=str.charAt(i);
				seen[c]=true;
			}
		}
		
		System.out.println("Result: "+result);
		
		sc.close();
	}

}
