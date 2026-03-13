package com.OOP;

public class GenericMethod {
	
	static <T> void genericDisplay(T element) {
		System.out.println(element);
		System.out.println(element.getClass().getName()+"="+element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericDisplay(11);
		genericDisplay("Test");
		genericDisplay(1.0);
	}

}
