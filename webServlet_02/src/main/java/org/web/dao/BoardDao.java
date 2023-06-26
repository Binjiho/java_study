package org.web.dao;

public class BoardDao {
	private static BoardDao INSTANCE;
	
	private BoardDao() {}
	
	private static class SingletonHelper{
		private static BoardDao INSTANCE = new BoardDao();
	}
	
	public static BoardDao getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
