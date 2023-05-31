package org.java.basicPackageEx;

public class ClassEx {
	public static void main(String[] args) {
		
		//클래스 찾기
		try {
			Class.forName("org.java.basicPackageEx");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//JDBC 드라이버 찾기
		try {
			Class.forName("oracle.jdbc.driver.OracleDrive");
			System.out.println("OracleDriver ok");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("OracleDrive not found");
		}		
	}
}
