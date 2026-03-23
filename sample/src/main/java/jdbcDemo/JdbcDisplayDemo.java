package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDisplayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "JeriJose.1";
		
		try(Connection conn = DriverManager.getConnection(dbUrl,username,password)){
			
			String sql = "SELECT * FROM Student";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int count = 0;
			
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String course = rs.getString("Course");
				String email = rs.getString("Email");
				
				String output = "Student #%d: %d - %s - %s - %s";
				System.out.println(String.format(output,++count,id,name,course,email));
			}
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
