package com.practice;


class Employee{
	int id;
	String name;
	
	public Employee() {
		id=17;
		name="Lala";
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void getEmployee() {
		System.out.println("Employee Name: "+name+"\nEmployee ID: "+id);
	}
	
}
public class ClassDemo {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[2];
		
		emp[0] = new Employee(12,"jason");
        emp[1] = new Employee(123,"mamaoa");
		
		emp[0].getEmployee();
		emp[1].getEmployee();
		
		new Employee().getEmployee();
	}

}
