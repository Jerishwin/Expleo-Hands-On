package com.OOP;
import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data =  "elcome to Java Portal!!! Have a Happy Learning";
		
		try {
			FileOutputStream output = new FileOutputStream("E:\\text.txt");
			byte[]array = data.getBytes();
			output.write(array);
			output.close();
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
