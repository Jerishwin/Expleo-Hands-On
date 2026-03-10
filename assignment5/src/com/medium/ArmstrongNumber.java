package com.medium;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int num,original,digit;
        int sum=0;

        System.out.print("Enter a 3-digit number: ");
        num = sc.nextInt();

        original=num;

        if (num<100||num>999) {
            System.out.println("Not a 3-digit number");
        } else {

            while (num!=0) {
                digit=num%10;        
                sum=sum+(digit*digit*digit);  
                num=num/10;        
            }

            if (sum==original) {
                System.out.println(original+" is an Armstrong number");
            } else {
                System.out.println(original+" is not an Armstrong number");
            }
        }

        sc.close();
	}

}
