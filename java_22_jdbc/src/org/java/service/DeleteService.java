package org.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.dao.ProductDao;
import org.java.dto.ProductDto;

public class DeleteService implements ProductService {
	@Override
	public void executeQuery() {
		Scanner scn = new Scanner(System.in);
		System.out.println("삭제하는 상품명을 입력해주세요.");
		String searchName = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> items = dao.getProductList(searchName);
		if(!items.isEmpty()) {
			//delete
			for (ProductDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("상품이름: %s 상품가격: %d 상품상세정보: %s 를 정말로 삭제하시겠습니까? (Y/N)",tmp.getName(), tmp.getPrice(), tmp.getDetail());
				String confirm = scn.next();
				if (confirm.equals("Y")) {
					int rs = dao.productDelete(id);

					if (rs!=1) {
						System.out.println("상품삭제 실패");
						System.out.println("실패한 상품 id: "+id);
						break;
					}else {
						System.out.println("상품삭제 성공");
					}
				}else {
					break;
				}
			}
		}else {
			System.out.println("삭제할 상품이 없습니다.");
		}
	}
}
