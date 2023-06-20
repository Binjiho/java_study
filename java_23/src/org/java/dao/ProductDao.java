package org.java.dao;

public class ProductDao {
	private static ProductDao INSTANCE;
	
	private ProductDao() {}
	
	private static class SingletonHelper{
		private static final ProductDao INSTANCE= new ProductDao();
	}
	
	public static ProductDao getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
