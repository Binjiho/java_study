package org.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.dao.ProductDao;
import org.java.dto.ProductDto;

public class UpdateService implements ProductService {
	@Override
	public void executeQuery() {
		Scanner scn = new Scanner(System.in);
		System.out.println("업데이트 하는 상품명을 입력해주세요.");
		String searchName = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> items = dao.getProductList(searchName);
		if(!items.isEmpty()) {
			//update
			for (ProductDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("기존상품이름: %s 새로운 상품이름입력: ",tmp.getName());
				String newName = scn.next();
				System.out.printf("기존상품가격: %d 새로운 상품가격입력: ",tmp.getPrice());
				int newPrice = scn.nextInt();
				System.out.printf("기존상품상세정보: %s, 새로운 상품상세정보입력: ",tmp.getDetail());
				String newDetail = scn.next();
				int rs = dao.productUpdate(searchName, id, newName, newPrice, newDetail);

				if (rs!=1) {
					System.out.println("상품업데이트 실패");
					System.out.println("실패한 상품 id: "+id);
					break;
				}else {
					System.out.println("상품업데이트 성공");
				}
			}
		}else {
			System.out.println("업데이트할 상품이 없습니다.");
		}
	}
}
