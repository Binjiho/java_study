package org.java.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberDelete implements MemberService{
	@Override
	public void executeQuery() {
		MemberDao dao = MemberDao.getInstance();
		Scanner scn = new Scanner(System.in);
		System.out.println("������ ������ ���̵� �Է�:");
		String searchId = scn.next();
		
		HashMap<String, String> searchMap = new HashMap<>();
		searchMap.put("searchId", searchId);
		
		ArrayList<MemberDto> items = dao.getList(searchMap);
		if (!items.isEmpty()) {
			for (MemberDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("���� ��ȣ: %d, ���� ���̵�: %s, ���� ��й�ȣ: %s, ���� ����ó: %s"
						, tmp.getId(), tmp.getUserid(), tmp.getUserpw(), tmp.getHtel());
				System.out.println();
				
				int rs = dao.DeleteList(id);
				if (rs > 0) {
					
				}else {
					System.out.println("������ �����Ͽ����ϴ�.");
					System.out.println("������ ��� ���̵�: "+tmp.getId());
					break;
				}
			}			
		}else {
			System.out.println("���� �Ϸ��� ������ �������� �ʽ��ϴ�");
		}
	}
}
