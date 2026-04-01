package com.procedure;

import java.sql.*;

public class EmployeeDOA {
	
	public void insertEmployee(Employee emp) {
		try(Connection conn = DBConnection1.getConnection();
			CallableStatement cs = conn.prepareCall("{call insert_employee(?, ?, ?)}")) {
			
			cs.setInt(1, emp.getId());
			cs.setString(2, emp.getName());
			cs.setString(3, emp.getDept());
			
			cs.execute();
			
			System.out.println("Employee inserted successfully.");
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayEmployees() {
		try(Connection conn = DBConnection1.getConnection();
			CallableStatement cs = conn.prepareCall("{call get_all_employees()}")) {
			
			ResultSet rs = cs.executeQuery();
			
			while (rs.next()) {
				System.out.println(
						rs.getInt("E_ID")+"|"+
						rs.getString("Name")+"|"+
						rs.getString("Dept"));
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateEmployee(int id, String name) {
		try(Connection conn = DBConnection1.getConnection();
			CallableStatement cs = conn.prepareCall("{call update_employee(?, ?)}")) {
			
			cs.setInt(1, id);
			cs.setString(2, name);
			
			cs.execute();
			
			System.out.println("Employee updated successfully.");
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
		try(Connection conn = DBConnection1.getConnection();
			CallableStatement cs = conn.prepareCall("{call delete_employee(?)}")) {
			
			cs.setInt(1, id);
			
			cs.execute();
			
			System.out.println("Employee deleted successfully.");
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getEmployeeById(int id) {
		try(Connection conn = DBConnection1.getConnection();
			CallableStatement cs = conn.prepareCall("{call get_employee_by_id(?,?,?)}")) {
			
			cs.setInt(1, id);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			
			cs.execute();
			
			System.out.println("Name: "+cs.getString(2));
			System.out.println("Dept: "+cs.getString(3));
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
