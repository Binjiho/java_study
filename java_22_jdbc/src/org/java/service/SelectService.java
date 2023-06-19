package org.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.dao.ProductDao;
import org.java.dto.ProductDto;

public class SelectService implements ProductService {
	@Override
	public void executeQuery() {
		System.out.println("Ư�� ��ǰ �˻��Ͻðڽ��ϱ�(Y/N)");
		Scanner scn = new Scanner(System.in);
		String condition = scn.next();
		String searchName = null;
		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> items = new ArrayList<ProductDto>();
		
		if (condition.equals("Y")) {
			System.out.println("��ǰ�̸� �˻�: ");
			searchName = scn.next();			
		}		
		if(searchName.length() > 0) {
			items = dao.getProductList(searchName);			
		}else {
			items = dao.getProductList("");			
		}
		
		if(!items.isEmpty()) {
			for(ProductDto tmp : items) {
				System.out.printf("��ǰ��: %s ��ǰ����: %d ��ǰ������: %s",tmp.getName(),tmp.getPrice(),tmp.getDetail());
				System.out.println();
			}
		}else {
			System.out.println("��ȸ�� ����� �����ϴ�.");
		}
		
	}
}
