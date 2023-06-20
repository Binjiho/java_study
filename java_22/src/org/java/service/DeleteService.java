package org.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.dao.ProductDao;
import org.java.dto.ProductDto;

public class DeleteService implements ProductService {
	@Override
	public void executeQuery() {
		Scanner scn = new Scanner(System.in);
		System.out.println("�����ϴ� ��ǰ���� �Է����ּ���.");
		String searchName = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> items = dao.getProductList(searchName);
		if(!items.isEmpty()) {
			//delete
			for (ProductDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("��ǰ�̸�: %s ��ǰ����: %d ��ǰ������: %s �� ������ �����Ͻðڽ��ϱ�? (Y/N)",tmp.getName(), tmp.getPrice(), tmp.getDetail());
				String confirm = scn.next();
				if (confirm.equals("Y")) {
					int rs = dao.productDelete(id);

					if (rs!=1) {
						System.out.println("��ǰ���� ����");
						System.out.println("������ ��ǰ id: "+id);
						break;
					}else {
						System.out.println("��ǰ���� ����");
					}
				}else {
					break;
				}
			}
		}else {
			System.out.println("������ ��ǰ�� �����ϴ�.");
		}
	}
}
