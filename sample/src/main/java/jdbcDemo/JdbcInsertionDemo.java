package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "JeriJose.1";
		
		try(Connection conn = DriverManager.getConnection(dbUrl,username,password)){
			
			String sql = "INSERT INTO Student(Id,name,Course,Email)Values(?,?,?,?)";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, 102);
			ps.setString(2, "Jerish");
			ps.setString(3, "Computer Science");
			ps.setString(4,"Jerish@gamil.com");
			
			int rowsInserted = ps.executeUpdate();
			
			if(rowsInserted>0) {
				System.out.println("A new student was inserted successfully!");
			}
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
