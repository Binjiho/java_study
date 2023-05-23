package org.java.classEx;

public class MemberController {
	public static void main(String[] args) {
		//°´Ã¼ »ý¼º
		MemberDto m1 = new MemberDto();
		m1.id=1L;
		m1.email="jj@naver.com";
		m1.phone="010-000-0000";
		m1.userId="jj";
		m1.userPw="1234";
		
		MemberDto m2 = new MemberDto();
		m2.id=2L;
		m2.email="ee@naver.com";
		m2.phone="010-1111-2222";
		m2.userId="ee";
		m2.userPw="E123";
		
		m2.getEmail();
	}
}
