package org.java.controller;

import java.util.Scanner;

import org.java.dto.MemberDTO;

public class MemberController {
	public static void main(String[] args) {
		MemberDTO md = new MemberDTO(1,"jiyu","1234","naver.com","000-000");
		String mdinfo = md.toString();
		System.out.println(mdinfo);
		
//		Scanner scn = new Scanner(System.in);
//		while(true) {
//			System.out.println("ȸ������ ������Ʈ�� ���� �Ͻðڽ��ϱ� (yes,no)");
//			String rs = scn.next(); 
//		}
	}
}
