package org.java.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id ="system";
		String pw ="1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("Connection Success");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection fail");
		}
		return conn;
	}
}
