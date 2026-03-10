package com.medium;

public class My_Record {

	public static void main(String[] args) {
		
		
		int[] my_record = new int[] {10,10,10,10,20,20,20,20,40,40,50,50,30 };
		int n = my_record.length;
		
		for(int i=0;i<n-1;i++) {
			
			if(my_record[i]==-1)
				continue;
			
			int count =1;
			
			for(int j=i+1;j<n;j++) {
				
					
				if(my_record[i]==my_record[j]){ // counting frequency
					
					count++;
					my_record[j]=-1;
				}

			}
			
			System.out.println(my_record[i]+"'s frequency is "+count);
			
		}
		
		if(my_record[n-1]!=-1) {
			System.out.println(my_record[n-1]+"'s frequency is 1");
		}
		

	}

}
