package org.project.controller;

import java.util.Scanner;

import org.project.dto.CartDto;
import org.project.dto.MemberDto;

public class CartController {
	
	public static void main(String[] args) {
		
		CartDto cart1 = new CartDto();
		cart1.setId(1);
		cart1.setItemName(null);
		cart1.setItemCount(0);
		cart1.setPrice(0);
		cart1.info();
		
		CartDto cart2 = new CartDto(2L,"dd",2,1000);
		cart2.info();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("장바구니를 실행하시겠습니까? yes or no");
			String initStr = scn.next();
			if (initStr.equals("yes")) {
				System.out.println("장바구니 실행");
				System.out.println("쿼리문을 입력하세요.insert,update,select,delete");
				String secStr = scn.next();
				if(secStr.equals("insert")) {
					System.out.println("장바구니번호(L)를 입력해주세요.");
					Long id = scn.nextLong();
					System.out.println("상품명(String)을 입력해주세요.");
					String itemName = scn.next();
					System.out.println("상품갯수(int)를 입력해주세요.");
					int itemCount = scn.nextInt();
					System.out.println("가격(int) 입력해주세요.");
					int price = scn.nextInt();
					CartDto cart = new CartDto(id,itemName,itemCount,price);
					cart.info();
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
