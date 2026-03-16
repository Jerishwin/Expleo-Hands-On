package com.Practice;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk=new Stack<String>();
		System.out.println("Size at the beginning: "+stk.capacity());
		
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		
		System.out.println("Original Vector "+stk);
		System.out.println("Size after addiion: "+stk.size());
		
		stk.pop();
		
		System.out.println("New Linked List "+stk);
		System.out.println("Size after removal: "+stk.size());
	}

}
