package org.java.service;

import java.util.Scanner;

import org.java.dao.MemberDao;

public class MemberInsert implements MemberService{
	@Override
	public void executeQuery() {
		MemberDao dao = MemberDao.getInstance();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ���̵� �Է�: ");
		String id = scn.next();
		System.out.println("���� ��й�ȣ �Է�: ");
		String pw = scn.next();
		System.out.println("���� �ڵ�����ȣ �Է�: ");
		String htel = scn.next();
		
		int rs = dao.InsertMember(id,pw,htel);

	}
}
