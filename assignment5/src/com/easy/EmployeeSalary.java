package com.easy;
import java.util.Scanner;

/**
 * This class takes Employee details and calculates their 
 * total salary
 */

public class EmployeeSalary {

	public static void main(String[] args) {
		
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		
		System.out.print("Enter The Wage: ");
		int wage = sc.nextInt();
		
		System.out.print("Enter Number of Days Worked: ");
		int workDays = sc.nextInt();
		
		if(workDays>30) { //bonus if worked more than 30 days
			salary = workDays*wage+5000;
		}else {
			salary = workDays*wage;
		}
		
		System.out.println("Details ");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Total Salary: "+salary);
		
		sc.close();
	}

}
