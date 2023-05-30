package org.java.dto;

public class MemberDTO {

	private long id;
	private String userId;
	private String userPw;
	private String email;
	private String phone;
	
	public MemberDTO() {}
	public MemberDTO(long id, String userId, String userPw, String email, String phone) {
		this.id = id;
		this.userId=userId;
		this.userPw=userPw;
		this.email=email;
		this.phone=phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", userId=" + userId + ", userPw=" + userPw + ", email=" + email + ", phone="
				+ phone + "]";
	}
}
