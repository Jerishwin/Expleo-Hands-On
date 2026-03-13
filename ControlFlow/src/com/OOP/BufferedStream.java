package com.OOP;
import java.io.*;

public class BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader buffinput = new BufferedReader(new FileReader("E://text.txt"));
				BufferedWriter bufOutput = new BufferedWriter(new FileWriter("E://output.txt"))){
			String line = "";
			while((line = buffinput.readLine())!=null) {
				bufOutput.write(line);
				bufOutput.newLine();
			}
		}catch(FileNotFoundException e) {
			System.out.print(e);
		}catch(IOException e) {
			System.out.print(e);
	}

}
}
