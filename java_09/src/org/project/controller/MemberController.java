package org.project.controller;

import java.util.Scanner;

import org.project.dto.MemberDto;

public class MemberController {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("프로젝트를 실행하시겠습니까? yes or no");
			String initStr = scn.next();
			if (initStr.equals("yes")) {
				System.out.println("회원가입 실행");
				System.out.println("쿼리문을 입력하세요.insert,update,select,delete");
				String secStr = scn.next();
				if(secStr.equals("insert")) {
					MemberDto member = new MemberDto();
					System.out.println("아이디를 입력해주세요.");
					String idStr = scn.next();
					member.setUserId(idStr);
					System.out.println(member.getUserId());
				}else if (secStr.equals("update")) {
					System.out.println("회원수정");
				}else if (secStr.equals("select")) {
					System.out.println("회원조회");
				}else if (secStr.equals("delete")) {
					System.out.println("회원탈퇴");
				}
			}else {
				System.out.println("종료합니다");
			}
			break;
		}
		
	}
}
