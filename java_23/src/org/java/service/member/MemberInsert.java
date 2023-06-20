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
		
		System.out.println("ȸ�����̵� �Է�:");
		String userId = scn.next();
		System.out.println("ȸ����й�ȣ �Է�:");
		String userPw = scn.next();
		System.out.println("ȸ����ȭ��ȣ �Է�:");
		String userHtel = scn.next();
		dao.Insert(userId, userPw, userHtel);
	}
}
