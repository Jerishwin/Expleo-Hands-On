package com.hard;
import java.util.*;

public class ASCII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input=sc.nextLine();

        char[] arr=input.toCharArray();

        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted String (ASCII Order): ");
        for (char ch:arr) {
            System.out.print(ch);
        }

        sc.close();
	}

}
