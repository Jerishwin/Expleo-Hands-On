package com.Practice;
import java.io.*;
import java.util.*;

class Mobile implements Comparable<Mobile>{

	private String name;
	private int ram;
	private int price;
	
	Mobile(String name,int ram,int price){
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		if(this.ram<o.getRam())
			return 1;
		else
			return -1;
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("Redmi",16,800));
		mobileList.add(new Mobile("Apple",8,100));
		mobileList.add(new Mobile("Samsung",4,600));
		
		Collections.sort(mobileList);
		System.out.println("Mobiles after sorting: ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile m:mobileList) {
			System.out.println(m.getName()+"\t"+m.getRam()+"\t"+m.getPrice());
		}
	}

}
