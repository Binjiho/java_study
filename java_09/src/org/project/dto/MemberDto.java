package org.project.dto;

public class MemberDto {
	
	//private ÇÊµå
	private long id;
	private String userId;
	private String userPw;
	private String email;
	private String phone;
	
	//setter
	public void setId(long id) {
		this.id = id;
	}
	
	//getter
	public long getId() {
		return id;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
}
