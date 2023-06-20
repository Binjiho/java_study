package org.java.service.member;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.service.MemberService;

public class MemberInsert implements MemberService {
	@Override
	public void executeQuery() throws IOException, SQLException {
		MemberDao dao = MemberDao.getInstance();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("회원아이디 입력:");
		String userId = scn.next();
		System.out.println("회원비밀번호 입력:");
		String userPw = scn.next();
		System.out.println("회원전화번호 입력:");
		String userHtel = scn.next();
		dao.Insert(userId, userPw, userHtel);
	}
}
