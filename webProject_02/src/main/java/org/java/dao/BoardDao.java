package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.java.dto.BoardDto;
import org.java.jdbc.DBConnection;

public class BoardDao {
	private static BoardDao INSTANCE;
	
	private BoardDao() {}
	
	private static class SingletonHelper{
		private static BoardDao INSTANCE = new BoardDao();
	}
	
	public static BoardDao getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public int insert(String userid, String userpw, String htel) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
			query = "insert into test_board(userid, userpw, htel) "
					+"values(?,?,?)";
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

	public ArrayList<BoardDto> getList(HashMap<String, String> searchMap) {
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<BoardDto> result = new ArrayList<BoardDto>();
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
			if (!searchMap.isEmpty()) {
				for( String strKey : searchMap.keySet() ){
					String strValue = searchMap.get(strKey);
					if (strKey.equals("searchId")) {
						query = "select * from test_board";
						query += " where userid=?";
						pstm = conn.prepareStatement(query);
						pstm.setString(1, strValue);
					}
				}
			}else {
				query = "select * from test_board";
				pstm = conn.prepareStatement(query);
			}
			rs=pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
					result.add(new BoardDto(
							rs.getLong(1)
							,rs.getString(2)
							,rs.getString(3)
							,rs.getString(4)
							,rs.getInt(5)
							,rs.getInt(6)
							,rs.getTimestamp(7)
							,rs.getTimestamp(8)
							));
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

	public BoardDto getDetail(Long id) {
		Connection conn = null;
		ResultSet rs = null;
		BoardDto result = new BoardDto();
		PreparedStatement pstm = null;
		String query = null;
		
		try {
			conn = DBConnection.getConnection();
			
			query = "select * from test_board where id = ?";
			pstm = conn.prepareStatement(query);
			pstm.setLong(1, id);
			rs=pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
					result = new BoardDto(
							rs.getLong(1)
							,rs.getString(2)
							,rs.getString(3)
							,rs.getString(4)
							,rs.getInt(5)
							,rs.getInt(6)
							,rs.getTimestamp(7)
							,rs.getTimestamp(8));
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
			query = "update test_board "
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
