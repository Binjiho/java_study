package org.java.controller;

import java.util.Scanner;

import org.java.service.MemberDelete;
import org.java.service.MemberInsert;
import org.java.service.MemberSelect;
import org.java.service.MemberService;
import org.java.service.MemberUpdate;

public class MemberController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1.¸â¹ö »ðÀÔ 2.¸â¹ö Á¶È¸ 3.¸â¹ö ¼öÁ¤ 4.¸â¹ö »èÁ¦");
			String tmp = scn.next();
			if(tmp.equals("1")) {
				MemberService service = new MemberInsert();
				service.executeQuery();
			}else if (tmp.equals("2")) {
				MemberService service = new MemberSelect();
				service.executeQuery();
				
			}else if (tmp.equals("3")) {
				MemberService service = new MemberUpdate();
				service.executeQuery();
				
			}else if (tmp.equals("4")) {
				MemberService service = new MemberDelete();
				service.executeQuery();				
			}else {
				break;
			}
		}
	}
}
