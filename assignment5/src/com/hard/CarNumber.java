package com.hard;
import java.util.*;

public class CarNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car no: ");
        int num = sc.nextInt();

        if (num<1000||num>9999) {
            System.out.println(num+" is not a valid car number");
        } 
        else {
            int sum=0;
            int temp=num;

            while (temp!=0) {
                sum=sum+(temp%10);
                temp=temp/10;
            }

            if (sum%3==0||sum%5==0||sum%7==0) {
                System.out.println("Lucky Number");
            } 
            else {
                System.out.println("Sorry it’s not my lucky number");
            }
        }

        sc.close();
	}

}
