package com.OOP;

import java.io.*;

class Employee implements java.io.Serializable{
	public  int empid;
	public String name;
	
	public Employee(int id,String name) {
		this.empid=id;
		this.name = name;
	}
}

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee object = new Employee(1,"Ram");
		String filename = "file.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.print("object is sterlised");
		}catch(IOException e) {
			System.out.print(e);
		}
		
		Employee object1 = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			object1 = (Employee)in.readObject();
			in.close();file.close();
			
			System.out.print("object is Desterlised");
		}catch(IOException e) {
			System.out.print(e);
		}catch(ClassNotFoundException e) {
			System.out.print(e);
		}
	}

}
