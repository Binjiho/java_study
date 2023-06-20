package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.java.dto.MemberDto;
import org.java.jdbc.DBConnect;

public class MemberDao {
	private static MemberDao INSTANCE;
	
	private MemberDao() {}
	
	private static class SingletonHelper{
		private static final MemberDao INSTANCE= new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public void Insert(String userId, String userPw, String userHtel) {

	}
	
	public ArrayList<MemberDto> getList(HashMap<String, String> searchMap) {
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<MemberDto> result = new ArrayList<MemberDto>();
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			//db楷悼
			conn = DBConnect.getConnection();
			//sql贸府
			if (!searchMap.isEmpty()) {
				for( String strKey : searchMap.keySet() ){
//					System.out.println(strKey + " = " + searchMap.get(strKey));
					String strValue = searchMap.get(strKey);
					if (strKey.equals("searchId")) {
						query = "select * from MEMBER";
						query += " where userid=?";
						pstm = conn.prepareStatement(query);
						pstm.setString(1, strValue);
					}
				}
			}else {
				query = "select * from MEMBER";
				pstm = conn.prepareStatement(query);
			}
			rs=pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
					result.add(new MemberDto(rs.getLong(1), rs.getString(2)
							,rs.getString(3),rs.getString(4), rs.getDate(5)));
				}
			}

		} catch (Exception e) {
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
		
		return result;
	}
	
	
	public boolean checkBool(HashMap<String,String> searchMap) {
		boolean result = false;
		Connection conn = null;
		ResultSet rs = null;

		PreparedStatement pstm = null;
		String query = null;
		
		try {
			//db楷悼
			conn = DBConnect.getConnection();
			//sql贸府
			if (!searchMap.isEmpty()) {
				for( String strKey : searchMap.keySet() ){
					String strValue = searchMap.get(strKey);
					if (strKey.equals("searchId")) {
						query = "select * from MEMBER";
						query += " where id=?";
						pstm = conn.prepareStatement(query);
						pstm.setString(1, strValue);
					} else if (strKey.equals("searchUserId")) {
						query = "select * from MEMBER";
						query += " where userid=?";
						pstm = conn.prepareStatement(query);
						pstm.setString(1, strValue);
					}
				}
			}else {
				query = "select * from MEMBER";
				pstm = conn.prepareStatement(query);
			}
			rs=pstm.executeQuery();
			
			if (rs!=null) {
				result = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
