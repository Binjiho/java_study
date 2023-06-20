package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.java.service.MemberService;
import org.java.service.member.MemberDelete;
import org.java.service.member.MemberInsert;
import org.java.service.member.MemberSelect;
import org.java.service.member.MemberUpdate;

public class ShopController {
	public static void main(String[] args) throws IOException, SQLException {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("요청서비스(1.MEMBER, 2.SHOP_BOARD, 3.PRODUCT)");
			String requestUrl = scn.next();
			if (requestUrl.equals("1")) {
				MemberService service = null;
				
				System.out.println("1.insert, 2.select, 3.update, 4.delete");
				String option = scn.next();
				if (option.equals("1")) {
					service = new MemberInsert();
					service.executeQuery();
				}else if (option.equals("2")) {
					service = new MemberSelect();
					service.executeQuery();
				}else if (option.equals("3")) {
					service = new MemberUpdate();
					service.executeQuery();
				}else if (option.equals("4")) {
					service = new MemberDelete();
					service.executeQuery();
				}else {
					break;
				}
			}
		}
	}
}
