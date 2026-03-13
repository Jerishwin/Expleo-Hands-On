package com.OOP;
import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input = new FileInputStream("E:\\text.txt");
			System.out.println("Data in File: ");
			int i = input.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();
			}
			input.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
