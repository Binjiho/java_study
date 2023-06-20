package org.java.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	public static Connection getConnection() {
		Connection conn = null;
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "system";
		String pw = "1234";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,id,pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection fail");
		}
		return conn;
	}
}
