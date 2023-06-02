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
			
			try {
				conn = DriverManager.getConnection(url,id,pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
