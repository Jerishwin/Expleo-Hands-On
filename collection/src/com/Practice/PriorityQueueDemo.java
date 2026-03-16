package com.Practice;
import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> p = new PriorityQueue<>();
		
		p.add("c");
		p.add("b");
		p.add("a");
		p.add("e");
		p.add("f");
		p.add("d");
		
		System.out.println("elements in ueue: ");
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}

	}

}
