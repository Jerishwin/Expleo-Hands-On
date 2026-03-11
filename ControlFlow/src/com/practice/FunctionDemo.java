package com.practice;
import java.util.*;

public class FunctionDemo {
	
	static void getMovieDetails(String name,String description,String duration, String lang,String relese,String country,String genre) {
		System.out.println("Movie Title: "+name);
		System.out.println("Movie Description: "+description);
		System.out.println("Movie Duration: "+duration);
		System.out.println("Movie Language: "+lang);
		System.out.println("Movie Release Date: "+relese);
		System.out.println("Movie Country: "+country);
		System.out.println("Movie Genre: "+genre);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Movie Title: ");
		String name = sc.next();
		
		System.out.println("Enter Movie Description: ");
		String description = sc.next();
		
		System.out.println("Enter Movie Duration: ");
		String duration = sc.next();
		
		System.out.println("Enter Movie Language: ");
		String lang = sc.next();
		
		System.out.println("Enter Movie Release Date: ");
		String relese = sc.next();
		
		System.out.println("Enter Movie Country: ");
		String country = sc.next();
		
		System.out.println("Enter Movie Genre: ");
		String genre = sc.next();
		
		getMovieDetails(name,description,duration,lang,relese,country,genre);
		
	}

}
