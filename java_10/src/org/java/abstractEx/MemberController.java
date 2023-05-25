package org.java.abstractEx;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {

		
		// MemberService 추상매서드 excuteQueryService 
		// MemberUpdate,MemberDelete,MemberSelect,MemberInsert클래스에 상속하고 구현
		// "회원탈퇴", "회원가입", "회원수정","회원조회" -> 콘솔에 출력
		// MemberController, while(true),Scanner,if ->
		// insert  "회원탈퇴"
		// update  "회원수정"
		// select  "회원조회"
		// delete  "회원탈퇴"
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("쿼리문입력(insert,update,delete,select): ");
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
				System.out.println("종료");
				break;
			} else {
				System.out.println("쿼리문 입력 오류");
			}

		}

	}
}
