package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCreateTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "JeriJose.1";
		
		try(Connection conn = DriverManager.getConnection(dbUrl,username,password)){
			
			String sql = "CREATE TABLE Student"+
					"(id INT NOT NULL,"+
					"name VARCHAR(50),"+
					"Course VARCHAR(50),"+
					"Email VARCHAR(50),"+
					"PRIMARY KEY(id))";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.executeUpdate();
			System.out.println("Table created successfully using PreparedStatement");
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
}
