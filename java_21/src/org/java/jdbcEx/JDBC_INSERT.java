package org.java.jdbcEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_INSERT {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;
		int result = 0;
		
		try {
			conn = DBconnect.getConnection();
			query = "insert into member(userId,userPw,email) values(?,?,?)";
			pstm = conn.prepareStatement(query); //쿼리문 실행
			pstm.setString(1, "test3");
			pstm.setString(2, "3333");
			pstm.setString(3, "test3@daum.net");
			result = pstm.executeUpdate(); //insert,update,delete 처리, 성공시 1을 반환
			
			if(result != 1) {
				System.out.println("회원가입 실패");
			}else {
				System.out.println("회원가입 성공");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
