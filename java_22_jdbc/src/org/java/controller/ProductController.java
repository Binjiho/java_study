package org.java.controller;

import java.util.Scanner;

import org.java.service.DeleteService;
import org.java.service.InsertService;
import org.java.service.ProductService;
import org.java.service.SelectService;
import org.java.service.UpdateService;

public class ProductController {
	public static void main(String[] args) {
		
		ProductService service = null;
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.상품등록, 2.상품조회, 3.상품변경, 4.상품삭제 중 선택해주세요!\n");
			String menu = scn.next();
			if (menu.equals("1")) {
				service = new InsertService();
				service.executeQuery();
			}else if (menu.equals("2")) {
				service = new SelectService();
				service.executeQuery();
			}else if (menu.equals("3")) {
				service = new UpdateService();
				service.executeQuery();
			}else if (menu.equals("4")) {
				service = new DeleteService();
				service.executeQuery();
			}else {
				break;
			}
		}
	}
}
