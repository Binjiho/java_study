package org.java.basicPackageEx;

public class ClassEx {
	public static void main(String[] args) {
		
		//Ŭ���� ã��
		try {
			Class.forName("org.java.basicPackageEx");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//JDBC ����̹� ã��
		try {
			Class.forName("oracle.jdbc.driver.OracleDrive");
			System.out.println("OracleDriver ok");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("OracleDrive not found");
		}		
	}
}
