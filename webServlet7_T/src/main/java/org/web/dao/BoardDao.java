package org.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.web.dbconnect.DBConnect;
import org.web.dto.BoardDto;
import org.web.dto.MemberDto;

public class BoardDao {

	private BoardDao() {
		System.out.println("BoardDao <- 싱글톤");
	}

	private static class SingltonClass {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return SingltonClass.INSTANCE;
	}

	public int boardInsert(String board_title, String content, String board_writer) {

		int rs = 0;

		System.out.println("작성자: " + board_writer);
		// 작성자가 Member0626테이블에 등록이 되지 않았다.
		if (boardWriterChecked(board_writer) != 1) { // 작성자가 1이아니면
			System.out.println("작성자가 등록 되지 않았다.");
			rs = 2;
			return rs;
		}

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();

//			query = "insert into board0626(BOARD0626_ID,BOARD_TITLE,CONTENT,board_writer) "
//					+ "values(board0626_seq.NEXTVAL,?,?,?)";
			query = "insert into board0626(BOARD_TITLE,CONTENT,board_writer, create_date) "
					+ "values(?,?,?,now())";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, board_title);
			pstm.setString(2, content);
			pstm.setString(3, board_writer);

			// return
			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

	private int boardWriterChecked(String board_writer) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0626 where email=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, board_writer);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					result = rs.getInt(1); // 작성자가 존재 하면 1
				}
			}
			// return

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public ArrayList<BoardDto> boardList() {
		ArrayList<BoardDto> boardList = new ArrayList<BoardDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from board0626   order by board0626_id desc  ";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					boardList.add(new BoardDto(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getDate(5)));
				}
			}
			// return

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return boardList;
	}

	public BoardDto boardDetail(Long board0626_id) {

		BoardDto board = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from board0626 where board0626_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setLong(1, board0626_id);
			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					board = new BoardDto(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getDate(5));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return board;
	}

	public int boardUpdate(Long board0626_id, String board_title, String content, String board_writer) {
		int rs = 0;

		System.out.println("게시글 번호: " + board0626_id);
		// 게시글이 Member0626테이블에 등록이 되지 않았다.
		if (boardIdChecked(board0626_id) != 1) { // 작성자가 1이아니면
			System.out.println("작성된 게시글이 없습니다.");
			rs = 2;
			return rs;
		}

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();

			query = "update  board0626  set  BOARD_TITLE=? ,CONTENT=? , board_writer=?   where board0626_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, board_title);
			pstm.setString(2, content);
			pstm.setString(3, board_writer);
			pstm.setLong(4, board0626_id);

			// return
			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

	private int boardIdChecked(Long board0626_id) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from board0626 where board0626_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setLong(1, board0626_id);
			rs = pstm.executeQuery();

			if (rs != null) {
				if (rs.next()) {
					result = rs.getInt(1);// id있으면 1
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int boardDelete(Long board0626_id) {

		int rs = 0;
		// 게시글 번호 확인
		if (boardIdChecked(board0626_id) != 1) { // 작성자가 1이아니면
			System.out.println("삭제할 게시글이 없습니다.");
			rs = 2;
			return rs;
		}

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete  from  board0626 where board0626_id=? ";
			pstm = conn.prepareStatement(query);

			pstm.setLong(1, board0626_id);

			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rs;
	}

	public int boardDelete2(Long board0626_id, String board_writer) {

		int rs = 0;
		// 게시글 번호 확인
		if (boardIdChecked(board0626_id) != 1) { // 작성자가 1이아니면
			System.out.println("삭제할 게시글이 없습니다.");
			rs = 2;
			return rs;
		}

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete  from  board0626 where board0626_id=? and board_writer=? ";
			pstm = conn.prepareStatement(query);

			pstm.setLong(1, board0626_id);
			pstm.setString(2, board_writer);

			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;

	}

}
