package com.OOP;

import java.io.*;

public class ByteIOStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[]b = new byte[128];
		try (FileInputStream fis = new FileInputStream("E:\\text.txt");
			
			FileOutputStream fos = new FileOutputStream("output.txt") ){
				System.out.println("Bytes avalible"+fis.available());
				int count =0,read = 0;
				while((read=fis.read(b))!=1) {
					fos.write(b);
					count+=read;
			}
				System.out.println("total count"+count);
		}catch(IOException e) {
			
		}
	}

}
