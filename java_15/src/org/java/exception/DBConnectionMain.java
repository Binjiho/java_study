package org.java.exception;

public class DBConnectionMain {
	public static void main(String[] args) {
		if(DBConnection.getConnection()!=null) {
			System.out.println("connection ok");
		}else {
			System.out.println("connection fail");
		}
	}
}
