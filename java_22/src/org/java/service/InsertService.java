package org.java.service;

import java.util.Scanner;

import org.java.dao.ProductDao;

public class InsertService implements ProductService {
	@Override
	public void executeQuery() {
		Scanner scn = new Scanner(System.in);
		System.out.println("상품이름입력: ");
		String name = scn.next();
		System.out.println("상품가격입력: ");
		int price = scn.nextInt();
		System.out.println("상품상세정보입력: ");
		String detail = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.productInsert(name,price,detail);
		
		if (rs!=1) {
			System.out.println("상품등록 실패");
		}else {
			System.out.println("상품등록 성공");
		}
	}
}
