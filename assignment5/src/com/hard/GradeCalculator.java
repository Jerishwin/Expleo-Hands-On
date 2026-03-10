package com.hard;
import java.util.*;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double exercise,exam;
		
		while(true) {
			
			System.out.print("Enter Grades (Exercise Exam): ");
			exercise = sc.nextInt();
			exam = sc.nextInt();
			
			if(exercise==-1||exam==-1) {
				break;
			}else if(exercise<5||exam<5) {
				System.out.println("You didn't Pass the Criteria");
			}else {
				exercise*=0.3;
				exam*=0.7;
				System.out.println("Final Grade: "+(exercise+exam));
			}		
			
		}
		
		sc.close();
	}

}
