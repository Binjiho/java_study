package org.java.dao;

public class ShopBoardDao {
	private static ShopBoardDao INSTANCE;
	
	private ShopBoardDao() {}
	
	private static class SingletonHelper{
		private static final ShopBoardDao INSTANCE= new ShopBoardDao();
	}
	
	public static ShopBoardDao getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
