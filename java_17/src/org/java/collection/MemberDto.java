package org.java.collection;

public class MemberDto {

	long id;
	String userId;
	String userPw;
	
	public MemberDto(long id, String userId, String userPw) {
		super();
		this.id = id;
		this.userId = userId;
		this.userPw = userPw;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
}
