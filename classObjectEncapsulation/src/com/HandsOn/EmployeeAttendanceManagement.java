package com.HandsOn;

import java.time.LocalTime;

class Employee {
	private int empid;
	private String empName;
	private Attendance attend;

	public void setId(int empid) {
		this.empid = empid;
	}

	public void setName(String empName) {
		this.empName = empName;
	}

	Employee(int empid, String empName) {
		this.setId(empid);
		this.setName(empName);
		this.attend = new Attendance(empid);
	}

	public void markCheckIn() {
		attend.markCheckIn();
	}

	public void markCheckOut() {
		attend.markCheckOut();
	}

	public void getAttendanceDetails() {

		System.out.println("Name: " + empName);
		attend.getAttendanceDetails();
	}
}

class Attendance {
	private int empid;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;

	private boolean isCheckedIn;
	private boolean isCheckedOut;

	Attendance(int empid) {
		this.empid = empid;
	}

	public void markCheckIn() {

		if (isCheckedIn) {
			System.out.print("Already Checked In");
		} else {
			checkInTime = LocalTime.now();
			isCheckedIn = true;
		}
	}

	public void markCheckOut() {
		if (isCheckedOut) {
			System.out.print("Already Checked Out");
		} else if (!isCheckedIn) {
			System.out.print("Haven't Checked In");
		} else {
			checkOutTime = LocalTime.now();
			isCheckedOut = true;
		}
	}

	public void getAttendanceDetails() {
		System.out.println("Is Checked in:" + isCheckedIn);
		System.out.println("Checked in Time:" + checkInTime);

		System.out.println("Is Checked out:" + isCheckedOut);
		System.out.println("Checked out Time:" + checkOutTime);
	}

}

public class EmployeeAttendanceManagement {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "John");
		e1.markCheckIn();
		e1.getAttendanceDetails();
		e1.markCheckOut();
		e1.getAttendanceDetails();
		
	}
	
	

}
