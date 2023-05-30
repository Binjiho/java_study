package org.java.service;

public class Select implements MemberService{
	@Override
	public void executeQuery() {
		System.out.println("회원조회");
	}
}
