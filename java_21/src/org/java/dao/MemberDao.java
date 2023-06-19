package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.jdbcEx.DBconnect;

public class MemberDao {
	//singleton
	private static MemberDao INSTANCE;
	
	private MemberDao() {}
	
	private static class SingletonHelper{
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	//CRUD
	public int InsertMember(String id, String pw, String htel) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			//db연동
			conn = DBconnect.getConnection();
			//sql처리
			query = "insert into Member(userid, userpw, htel, create_date) "
					+"values(?,?,?,sysdate)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			pstm.setString(3, htel);
			rs = pstm.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
}
