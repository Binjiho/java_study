package org.web.dao;

public class EmployeeDao {
	private static EmployeeDao INSTANCE;
	
	private EmployeeDao() {}
	
	private static class SingletonHelper{
		private static EmployeeDao INSTANCE = new EmployeeDao();
	}
	
	public static EmployeeDao getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public int insert(String name, String email, String depart) {
		// TODO Auto-generated method stub
		return 0;
	}
}
