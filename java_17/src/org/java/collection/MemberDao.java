package org.java.collection;

public class MemberDao {
	//싱글톤
	private static MemberDao INSTANCE;
	
	private MemberDao() {}
	
	private static class SingletonHelper{ //내부클래스 -> static final = new 생성자();
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
