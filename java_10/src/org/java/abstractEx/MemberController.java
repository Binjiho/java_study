package org.java.abstractEx;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {

		
		// MemberService �߻�ż��� excuteQueryService 
		// MemberUpdate,MemberDelete,MemberSelect,MemberInsertŬ������ ����ϰ� ����
		// "ȸ��Ż��", "ȸ������", "ȸ������","ȸ����ȸ" -> �ֿܼ� ���
		// MemberController, while(true),Scanner,if ->
		// insert  "ȸ��Ż��"
		// update  "ȸ������"
		// select  "ȸ����ȸ"
		// delete  "ȸ��Ż��"
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("�������Է�(insert,update,delete,select): ");
			String query = input.next();
			
			MemberService service=null;			

			if (query.equals("insert")) {				
				service=new MemberInsert();
				service.excuteQueryService();
			} else if (query.equals("update")) {
				service=new MemberUpdate();
				service.excuteQueryService();
			} else if (query.equals("delete")) {
				service=new MemberDelete();
				service.excuteQueryService();
			} else if (query.equals("select")) {
				service=new MemberSelect();
				service.excuteQueryService();
			} else if (query.equals("exit")) {
				System.out.println("����");
				break;
			} else {
				System.out.println("������ �Է� ����");
			}

		}

	}
}
