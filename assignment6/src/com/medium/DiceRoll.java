package com.medium;
import java.util.*;

public class DiceRoll {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		int[] count = new int[7];
		
		Random random = new Random();
		
		for(int i=0;i<100;i++) {
			arr[i]=random.nextInt(6)+1;
			count[arr[i]]++;
		}
		
		System.out.print("Frequency of 1:"+count[1]
				+"\nFrequency of 2:"+count[2]
						+"\nFrequency of 3:"+count[3]
								+"\nFrequency of 4:"+count[4]
										+"\nFrequency of 5:"+count[5]
												+"\nFrequency of 6:"+count[6]);
	}

}
