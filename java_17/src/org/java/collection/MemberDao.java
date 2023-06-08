package org.java.collection;

public class MemberDao {
	//�̱���
	private static MemberDao INSTANCE;
	
	private MemberDao() {}
	
	private static class SingletonHelper{ //����Ŭ���� -> static final = new ������();
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
