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
		while(true) {
			System.out.println("INSERT/UPDATE/SELECT/DELETE");
			String crud = scn.next();
			if (crud.equals("INSERT")) {
				MemberInsert ms = new MemberInsert(); 
				ms.executeQueryService();
				System.out.println("회원번호 입력 : ");
				Long id = scn.nextLong();
				System.out.println("회원아이디 입력 : ");
				String userId = scn.next();
				System.out.println("회원비밀번호 입력 : ");
				String userPw = scn.next();
				MemberDto tmp = ms.generateMember(id,userId,userPw);
				mList.add(tmp);
				
			}else if (crud.equals("UPDATE")) {
//				ms = new MemberInsert(); 
//				ms.executeQueryService();
			}else if (crud.equals("SELECT")) {
				//멤버 조회
				if (mList.isEmpty()) {
					System.out.println("회원정보가 없습니다");
				}else {
					for(MemberDto members : mList) {
						System.out.println(String.format("아이디번호: %s, 이메일: %s 비번: %s", members.getId(), members.getUserId(), members.getUserPw() ));
					}					
				}
			}else if (crud.equals("DELETE")) {
//				ms = new MemberInsert(); 
//				ms.executeQueryService();
			}else {
				break;
			}
			
		}
	}
}
