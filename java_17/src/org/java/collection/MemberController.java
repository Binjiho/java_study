package org.java.collection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) throws SQLException, IOException {
		Scanner scn = new Scanner(System.in);
		MemberDto member = null;
		List<MemberDto> mList = new ArrayList<MemberDto>();
		System.out.println("INSERT/UPDATE/SELECT/DELETE");
		while(true) {
			String crud = scn.next();
			if (crud.equals("INSERT")) {
				MemberInsert ms = new MemberInsert(); 
				ms.executeQueryService();
				Long id = scn.nextLong();
				String userId = scn.next();
				String userPw = scn.next();
				MemberDto tmp = ms.generateObject(id,userId,userPw);
				mList.add(tmp);
				
			}
			if (crud.equals("UPDATE")) {
//				ms = new MemberInsert(); 
//				ms.executeQueryService();
			}
			if (crud.equals("SELECT")) {
//				ms = new MemberInsert(); 
//				ms.executeQueryService();
			}
			if (crud.equals("DELETE")) {
//				ms = new MemberInsert(); 
//				ms.executeQueryService();
			}else {
				break;
			}
			//멤버 조회
			for(MemberDto members : mList) {
				System.out.println(String.format("아이디번호: %s, 이메일: %s 비번: %s", members.getId(), members.getUserId(), members.getUserPw() ));
			}
		}
	}
}
