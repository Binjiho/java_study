package org.java.service;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert implements MemberService{
	@Override
	public void executeQuery() {
		MemberDao dao = MemberDao.getInstance();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("유저 아이디 입력: ");
		String id = scn.next();
		System.out.println("유저 비밀번호 입력: ");
		String pw = scn.next();
		System.out.println("유저 핸드폰번호 입력: ");
		String htel = scn.next();
		
		int rs = dao.InsertMember(id,pw,htel);

	}
}
