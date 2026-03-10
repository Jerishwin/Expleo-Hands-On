package com.easy;
import java.util.*;

/**
 * This class uses do-while
 * loop to evaluate the series 1+2+3+…..+i
 */

public class SumOfN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),sum=0,i=1;
		
		do {
			
			sum+=i;
			i++;
			
		}while(i<=n);
		
		System.out.print("Sum of N: "+sum);
		
		sc.close();
	}

}
