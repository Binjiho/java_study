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
		System.out.println("업데이트할 유저의 아이디를 입력:");
		String searchId = scn.next();

		HashMap<String, String> searchMap = new HashMap<>();
		searchMap.put("searchId", searchId);
		
		ArrayList<MemberDto> items = dao.getList(searchMap);
		if (!items.isEmpty()) {
			for (MemberDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("기존 유저 아이디=%s 새로운 유저 아이디 입력 :",tmp.getUserid());
				String newId = scn.next();
				System.out.printf("기존 유저 비밀번호=%s 새로운 유저 비밀번호 입력 :",tmp.getUserpw());
				String newPw = scn.next();
				System.out.printf("기존 유저 휴대폰번호=%s 새로운 유저 휴대폰번호 입력 :",tmp.getHtel());
				String newHtel = scn.next();
				
				int rs = dao.UpdateList(id, newId, newPw, newHtel);
				if (rs > 0) {
					
				}else {
					System.out.println("업데이트에 실패하였습니다.");
					System.out.println("실패한 멤버 아이디: "+tmp.getId());
					break;
				}
			}			
		}else {
			System.out.println("업데이트 하려는 유저가 존재하지 않습니다");
		}
	}
}
