package com.OOP;

import java.io.*;

public class CharIOStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]b = new char[128];
		try (FileReader fr = new FileReader("E:\\text.txt");
			
			FileWriter fe = new FileWriter("output.txt")){
			int count =0,read = 0,i=0;
			while((read=fr.read(b))!=-1) {
				fe.write(b);
				count+=read;
				System.out.println(i++);
			}
			System.out.println("total count"+count);
		}catch(FileNotFoundException f) {
			System.out.println(f);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
