package com.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class PriceCompare implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		if(o1.getPrice()<o2.getPrice())return -1;
		if(o1.getPrice()>o2.getPrice())return 1;
		else return 0;
	}
	
}

class NameCompare implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("Redmi",16,800));
		mobileList.add(new Mobile("Apple",8,100));
		mobileList.add(new Mobile("Samsung",4,600));
		
		System.out.println("Sorted by price: ");
		PriceCompare priceCompare = new PriceCompare();
		Collections.sort(mobileList,priceCompare);
		
		System.out.println("Mobiles after sorting: ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile m:mobileList) {
			System.out.println(m.getName()+"\t"+m.getRam()+"\t"+m.getPrice());
		}
	}

}
