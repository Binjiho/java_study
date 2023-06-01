package org.java.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static void main(String[] args) {

		Connection conn = null; //db °´Ã¼
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe"; //db °æ·Î
		String dbId = "system";
		String dbPw = "1234";
		
		try {
			//1.driver Ã£±â
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("db instance success");
			
			//2.connection °´Ã¼ -> db¿¬°á
			conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
			System.out.println("db Connect success");
					
		} catch (ClassNotFoundException e) {
			System.out.println("db instance fail");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db Connect fail");
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
