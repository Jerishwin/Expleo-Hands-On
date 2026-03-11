package com.practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadMovie {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Movie Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Movie Name: ");
		String name = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Movie Description: ");
		String description  = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Movie Language: ");
		String lang = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Movie Genre: ");
		String genre = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Movie Release Date (dd/mm/yyyy): ");
		String date = sc.next();
		SimpleDateFormat releaseDate = new SimpleDateFormat("dd/MM/yyyy");
		Date moviedate = releaseDate.parse(date);
		
		System.out.print("Enter Movie Seat Cost: ");
		float seat = sc.nextFloat();
		
		System.out.println("\nMOVIE DETAILS");
		System.out.println("Movie Id: "+id);
		System.out.println("Movie Name: "+name);
		System.out.println("Movie Description: "+description);
		System.out.println("Movie Language: "+lang);
		System.out.println("Movie Genre: "+genre);
		System.out.println("Movie Release Date: "+moviedate);
		System.out.println("Movie Seat Cost: "+seat);
		
		sc.close();
	}

}
