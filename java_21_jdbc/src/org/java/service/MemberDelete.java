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
		System.out.println("삭제할 유저의 아이디를 입력:");
		String searchId = scn.next();
		
		HashMap<String, String> searchMap = new HashMap<>();
		searchMap.put("searchId", searchId);
		
		ArrayList<MemberDto> items = dao.getList(searchMap);
		if (!items.isEmpty()) {
			for (MemberDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("유저 번호: %d, 유저 아이디: %s, 유저 비밀번호: %s, 유저 연락처: %s"
						, tmp.getId(), tmp.getUserid(), tmp.getUserpw(), tmp.getHtel());
				System.out.println();
				
				int rs = dao.DeleteList(id);
				if (rs > 0) {
					
				}else {
					System.out.println("삭제에 실패하였습니다.");
					System.out.println("실패한 멤버 아이디: "+tmp.getId());
					break;
				}
			}			
		}else {
			System.out.println("삭제 하려는 유저가 존재하지 않습니다");
		}
	}
}
