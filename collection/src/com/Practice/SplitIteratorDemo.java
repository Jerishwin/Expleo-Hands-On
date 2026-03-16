package com.Practice;

import java.util.*;

public class SplitIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double>arr = new ArrayList<Double>();
		
		arr.add(1.0);
		arr.add(2.0);
		arr.add(3.0);
		arr.add(0.4);
		
		System.out.println("Contents of Array using tryAdvance: ");
		Spliterator<Double>sitr = arr.spliterator();
		while(sitr.tryAdvance((n)->System.out.print(n+" ")));
		System.out.println();
		System.out.println("Contents of Array using forEachRemaning: ");
		sitr=arr.spliterator();
		sitr.forEachRemaining((n)->System.out.print(n+" "));
		System.out.println();
		System.out.print("Size of the array "+arr.size());
	}

}
