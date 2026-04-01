package com.procedure;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection1 {

	public static Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "JeriJose.1";
		
		return DriverManager.getConnection(url, username, password);
	}

}
