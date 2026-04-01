package com.procedure;

import java.util.Scanner;
public class EmployeeCRUDProceduresDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeDOA dao = new EmployeeDOA();
		int choice = 0;
		
		do {
			System.out.println("\nPlease select an option:");
			System.out.println("1. Insert new Employee");
			System.out.println("2. Display all Employees");
			System.out.println("3. Update Employee Department");
			System.out.println("4. Delete Employee");
			System.out.println("5. Get Employee by ID");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					System.out.println("\n---Insert New Employee---");
					System.out.print("Enter Employee ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Enter Employee Name: ");
					String name = sc.nextLine();
					
					System.out.print("Enter Employee Department: ");
					String dept = sc.nextLine();
					
					dao.insertEmployee(new Employee(id, name, dept));
					break;
				case 2:
					System.out.println("\n---All Employees---");
					dao.displayEmployees();
					break;
				case 3:
					System.out.println("\n---Update Employee Department---");
					System.out.print("Enter Employee ID: ");
					int updateId = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Enter new Department: ");
					String newDept = sc.nextLine();
					
					dao.updateEmployee(updateId, newDept);
					break;
				case 4:
					System.out.println("\n---Delete Employee---");
					System.out.print("Enter Employee ID: ");
					int deleteId = sc.nextInt();
					sc.nextLine();
					
					dao.deleteEmployee(deleteId);
					break;
			}
			
		}while(choice != 0);
		
		sc.close();
	}

}
