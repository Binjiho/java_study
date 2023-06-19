package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.dbconnect.DBconnect;
import org.java.dto.ProductDto;

public class ProductDao {
	//singleton
	private static ProductDao INSTANCE;
	
	private ProductDao() {}
	
	private static class singletonHelper{
		private static final ProductDao INSTANCE = new ProductDao();
	}
	
	public static ProductDao getInstance() {
		return singletonHelper.INSTANCE;
	}
	
	//CRUD
	public int productInsert(String name, int price, String detail) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query =null;
		
		try {
			//db楷悼
			conn = DBconnect.getConnection();
			//sql贸府
			query = "insert into product_01(id,name,price,detail) "
			+"values(product_01_seq.NEXTVAL,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setInt(2, price);
			pstm.setString(3,detail);
			rs=pstm.executeUpdate(); // insert,update,delete
			
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
		return rs;
	}

	public ArrayList<ProductDto> getProductList(String name) {
		ArrayList<ProductDto> result= new ArrayList<ProductDto>();
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query =null;
		
		try {
			//db楷悼
			conn = DBconnect.getConnection();
			//sql贸府
			query = "select * from product_01";
			if (name.length() > 0) {
				query += " where name=?";
			}
			pstm = conn.prepareStatement(query);
			if (name.length() > 0) {
				pstm.setString(1, name);
			}
			rs=pstm.executeQuery(); // select
			
			if(rs!=null) {
				while(rs.next()) {
					result.add(new ProductDto(rs.getLong("id"), rs.getString("name"), rs.getInt("price")
							, rs.getString("detail"), rs.getDate("create_date") ));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstm!=null) {
						pstm.close();
					}
					if(rs!=null) {
						rs.close();
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

	public int productUpdate(String searchName, Long id, String newName, int newPrice, String newDetail) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query =null;
		
		try {
			//db楷悼
			conn = DBconnect.getConnection();
			//sql贸府
			query = "update product_01 set name=?, price=?, detail=? "
			+"where name=? and id=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, newName);
			pstm.setInt(2, newPrice);
			pstm.setString(3,newDetail);
			pstm.setString(4,searchName);
			pstm.setLong(5,id);
			rs=pstm.executeUpdate(); // insert,update,delete
			
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
		return rs;
	}

	public int productDelete(Long id) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query =null;
		
		try {
			//db楷悼
			conn = DBconnect.getConnection();
			//sql贸府
			query = "delete product_01"
			+" where id=?";
			pstm = conn.prepareStatement(query);
			pstm.setLong(1,id);
			rs=pstm.executeUpdate(); // insert,update,delete
			
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
		return rs;
	}
}
