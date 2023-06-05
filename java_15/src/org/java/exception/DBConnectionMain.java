package org.java.exception;

import java.sql.Connection;

public class DBConnectionMain {
	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		
		if(conn !=null) {
			System.out.println(conn);
		}else {
			System.out.println("conn is null");
		}
	}
}
