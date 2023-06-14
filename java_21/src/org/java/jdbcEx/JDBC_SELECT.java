package org.java.jdbcEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

class MemberDto {
	private String userId;
	private String userPw;
	private String email;
	
	public MemberDto() {}
	
	public MemberDto(String userId, String userPw, String email) {
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

public class JDBC_SELECT {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;
		ResultSet result = null;
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		
		try {
			conn = DBconnect.getConnection();
			query = "select * from member";
			pstm = conn.prepareStatement(query); //쿼리문 실행
			
			result = pstm.executeQuery(); //select 처리
			
			if(result != null) {
				while (result.next()) {
					String a = result.getString("userId");
					String b = result.getString(2);
					String c = result.getString("email");					
//					System.out.println(a + "/" + b + "/" + c);
					members.add(new MemberDto(a,b,c));
				}
			}else {
				System.out.println("조회 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (result != null) {
					result.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (MemberDto member : members) {
			System.out.println(String.format("userId = %s", member.getUserId()));
			System.out.println(String.format("userPw = %s", member.getUserPw()));
			System.out.println(String.format("email = %s", member.getEmail()));
		}
	}
}
