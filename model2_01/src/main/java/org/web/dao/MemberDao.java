package org.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.web.dto.MemberDto;
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

	public ArrayList<MemberDto> getList(HashMap<String, String> searchMap) {
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<MemberDto> result = new ArrayList<MemberDto>();
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
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

	public MemberDto getDetail(Long id) {
		Connection conn = null;
		ResultSet rs = null;
		MemberDto result = new MemberDto();
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
			
			query = "select * from MEMBER where id = ?";
			pstm = conn.prepareStatement(query);
			pstm.setLong(1, id);
			rs=pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
					result = new MemberDto(rs.getLong(1), rs.getString(2)
							,rs.getString(3),rs.getString(4), rs.getDate(5));
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

	public int update(Long id, String userid, String userpw, String htel) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
			query = "update MEMBER "
					+"set userid=?, userpw=?, htel=? "
					+"where id=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			pstm.setString(3, htel);
			pstm.setLong(4, id);
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
