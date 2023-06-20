package org.java.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberSelect implements MemberService{
	@Override
	public void executeQuery() {
		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberDto> items = new ArrayList<MemberDto>();
		HashMap<String,String> searchMap = new HashMap<>();

		items = dao.getList(searchMap);
		for (MemberDto tmp : items) {
			System.out.printf("���� ��ȣ: %d, ���� ���̵�: %s, ���� ��й�ȣ: %s, ���� ����ó: %s"
					, tmp.getId(), tmp.getUserid(), tmp.getUserpw(), tmp.getHtel());
			System.out.println();
		}
	}
}
