package org.java.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	
	public static Connection getConnection() {
		Connection conn =null;
		String url = "oracle.jdbc.driver.OracleDriver";
		String id = "system";
		String pw = "1234";
		
		try {
			Class.forName("jdbc:oracle:thin:@localhost:1521:xe");
			
			conn = DriverManager.getConnection(url,id,pw);
		} catch (ClassNotFoundException e) {
			System.out.println("driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}
		
		return conn;
	}
}
