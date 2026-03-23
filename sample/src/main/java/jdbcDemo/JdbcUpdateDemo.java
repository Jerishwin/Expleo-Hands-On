package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "JeriJose.1";
		
		try(Connection conn = DriverManager.getConnection(dbUrl,username,password)){
			
			String sql = "UPDATE Student SET Course = ?,Email = ? WHERE Name = ?";
					
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "Information Technology");
			ps.setString(2, "Jerishwinj@gamail.com");
			ps.setString(3, "Jerish");
			
			int rowsUpdated = ps.executeUpdate();
			
			if(rowsUpdated>0) {
				System.out.println("Student record was updated successfully!");
			}else {
				System.out.println("No match is found.");
			}
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
