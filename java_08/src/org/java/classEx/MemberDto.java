package org.java.classEx;

//접근지정자(접근제한자)
public class MemberDto {
	//클래스의 멤버 : 필드, 메서드, 생성자
    
	//필드
	public Long id;
	public String email;
	public String phone;
	public String userId;
	public String userPw; //비밀번호 암호 (Spring Security)
	
	//메서드
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	//생성자 : 생성자는 객체를 생성
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
}
