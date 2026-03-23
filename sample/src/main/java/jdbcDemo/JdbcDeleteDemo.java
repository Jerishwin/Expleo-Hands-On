package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "JeriJose.1";
		
		try(Connection conn = DriverManager.getConnection(dbUrl,username,password)){
			
			String sql = "DELETE FROM Student WHERE Name = ?";
					
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "Jerish");
			
			int rowsDeleted = ps.executeUpdate();
			
			if(rowsDeleted>0) {
				System.out.println("Student record was deleted successfully!");
			}else {
				System.out.println("No match is found.");
			}
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
