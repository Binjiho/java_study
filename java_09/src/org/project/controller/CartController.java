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
			System.out.println("��ٱ��ϸ� �����Ͻðڽ��ϱ�? yes or no");
			String initStr = scn.next();
			if (initStr.equals("yes")) {
				System.out.println("��ٱ��� ����");
				System.out.println("�������� �Է��ϼ���.insert,update,select,delete");
				String secStr = scn.next();
				if(secStr.equals("insert")) {
					System.out.println("��ٱ��Ϲ�ȣ(L)�� �Է����ּ���.");
					Long id = scn.nextLong();
					System.out.println("��ǰ��(String)�� �Է����ּ���.");
					String itemName = scn.next();
					System.out.println("��ǰ����(int)�� �Է����ּ���.");
					int itemCount = scn.nextInt();
					System.out.println("����(int) �Է����ּ���.");
					int price = scn.nextInt();
					CartDto cart = new CartDto(id,itemName,itemCount,price);
					cart.info();
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
