package org.project.controller;

import java.util.Scanner;

import org.project.dto.MemberDto;

public class MemberController {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("������Ʈ�� �����Ͻðڽ��ϱ�? yes or no");
			String initStr = scn.next();
			if (initStr.equals("yes")) {
				System.out.println("ȸ������ ����");
				System.out.println("�������� �Է��ϼ���.insert,update,select,delete");
				String secStr = scn.next();
				if(secStr.equals("insert")) {
					MemberDto member = new MemberDto();
					System.out.println("���̵� �Է����ּ���.");
					String idStr = scn.next();
					member.setUserId(idStr);
					System.out.println(member.getUserId());
				}else if (secStr.equals("update")) {
					System.out.println("ȸ������");
				}else if (secStr.equals("select")) {
					System.out.println("ȸ����ȸ");
				}else if (secStr.equals("delete")) {
					System.out.println("ȸ��Ż��");
				}
			}else {
				System.out.println("�����մϴ�");
			}
			break;
		}
		
	}
}
