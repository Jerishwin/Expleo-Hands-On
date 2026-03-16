package com.Practice;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector<String>();
		System.out.println("Size at the beginning: "+v.capacity());
		
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		
		
		System.out.println("Original Vector "+v);
		System.out.println("Size after addiion: "+v.size());
		
		v.remove(0);
		v.remove("C");
		
		System.out.println("New Linked List "+v);
		System.out.println("Size after removal: "+v.size());
	}

}
