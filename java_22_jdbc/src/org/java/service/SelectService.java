package org.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.dao.ProductDao;
import org.java.dto.ProductDto;

public class SelectService implements ProductService {
	@Override
	public void executeQuery() {
		System.out.println("특정 상품 검색하시겠습니까(Y/N)");
		Scanner scn = new Scanner(System.in);
		String condition = scn.next();
		String searchName = null;
		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> items = new ArrayList<ProductDto>();
		
		if (condition.equals("Y")) {
			System.out.println("상품이름 검색: ");
			searchName = scn.next();			
		}		
		if(searchName.length() > 0) {
			items = dao.getProductList(searchName);			
		}else {
			items = dao.getProductList("");			
		}
		
		if(!items.isEmpty()) {
			for(ProductDto tmp : items) {
				System.out.printf("상품명: %s 상품가격: %d 상품상세정보: %s",tmp.getName(),tmp.getPrice(),tmp.getDetail());
				System.out.println();
			}
		}else {
			System.out.println("조회할 목록이 없습니다.");
		}
		
	}
}
