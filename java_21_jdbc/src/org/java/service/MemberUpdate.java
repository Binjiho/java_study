package org.java.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;

public class MemberUpdate implements MemberService{
	@Override
	public void executeQuery() {
		MemberDao dao = MemberDao.getInstance();
		Scanner scn = new Scanner(System.in);
		System.out.println("������Ʈ�� ������ ���̵� �Է�:");
		String searchId = scn.next();

		HashMap<String, String> searchMap = new HashMap<>();
		searchMap.put("searchId", searchId);
		
		ArrayList<MemberDto> items = dao.getList(searchMap);
		if (!items.isEmpty()) {
			for (MemberDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("���� ���� ���̵�=%s ���ο� ���� ���̵� �Է� :",tmp.getUserid());
				String newId = scn.next();
				System.out.printf("���� ���� ��й�ȣ=%s ���ο� ���� ��й�ȣ �Է� :",tmp.getUserpw());
				String newPw = scn.next();
				System.out.printf("���� ���� �޴�����ȣ=%s ���ο� ���� �޴�����ȣ �Է� :",tmp.getHtel());
				String newHtel = scn.next();
				
				int rs = dao.UpdateList(id, newId, newPw, newHtel);
				if (rs > 0) {
					
				}else {
					System.out.println("������Ʈ�� �����Ͽ����ϴ�.");
					System.out.println("������ ��� ���̵�: "+tmp.getId());
					break;
				}
			}			
		}else {
			System.out.println("������Ʈ �Ϸ��� ������ �������� �ʽ��ϴ�");
		}
	}
}
