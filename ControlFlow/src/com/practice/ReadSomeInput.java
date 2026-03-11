package com.practice;
import java.util.Scanner;
/**
 * The ReadSomeInput class implements
 * reading console inputs
 */
public class ReadSomeInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Name: "+name+" Welcome to the traning program");
		
		sc.close();
	}

}
