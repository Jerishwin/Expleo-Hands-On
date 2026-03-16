package com.Practice;

import java.util.PriorityQueue;

class Task implements Comparable<Task>{
	private String name;
	private int priority;
	
	public Task(String name,int priority) {
		this.name = name;
		this.priority = priority; 
	}
	
	public int getPriority() {
		return priority;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.priority, this.priority);
	}
}

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Task> p = new PriorityQueue<>();
		
		p.add(new Task("Task1",3));
		p.add(new Task("Task2",1));
		p.add(new Task("Task3",2));
		
		System.out.println("elements in ueue: ");
		while(!p.isEmpty()) {
			System.out.println(p.poll().getName());
		}
	}

}
