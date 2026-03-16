package com.Practice;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println("Initial array Size: "+arr.size());
		
		arr.add("c");
		arr.add("a");
		arr.add("e");
		arr.add("B");
		arr.add("d");
		arr.add("f");
		arr.add(1,"g");
		
		System.out.println("Size: "+arr.size());
		System.out.println("Contents of the array: "+arr);
		
		arr.remove("f");
		arr.remove(2);
		System.out.println("Contents of the array: "+arr);
	}

}
