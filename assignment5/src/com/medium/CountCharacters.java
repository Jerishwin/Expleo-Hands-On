package com.medium;
import java.util.*;

public class CountCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int letters=0,digits=0,others=0;

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                others++;
            }
        }

        System.out.println("Letters: " + letters +
                           ", Digits: " + digits +
                           ", Other Symbols: " + others);

        sc.close();
	}

}
