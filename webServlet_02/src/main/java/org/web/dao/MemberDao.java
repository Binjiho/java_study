package org.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.web.dbconnect.DBConnection;

public class MemberDao {
	private static MemberDao INSTANCE;
	
	private MemberDao() {}
	
	private static class SingletonHelper{
		private static MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public int insert(String userid, String userpw, String htel) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
			query = "insert into MEMBER(id, userid, userpw, htel) "
					+"values(member_seq.NEXTVAL,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			pstm.setString(3, htel);
			rs = pstm.executeUpdate();
		} catch (SQLException e) {
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
