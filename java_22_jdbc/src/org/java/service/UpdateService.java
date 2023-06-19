package org.java.service;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.dao.ProductDao;
import org.java.dto.ProductDto;

public class UpdateService implements ProductService {
	@Override
	public void executeQuery() {
		Scanner scn = new Scanner(System.in);
		System.out.println("������Ʈ �ϴ� ��ǰ���� �Է����ּ���.");
		String searchName = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> items = dao.getProductList(searchName);
		if(!items.isEmpty()) {
			//update
			for (ProductDto tmp : items) {
				Long id = tmp.getId();
				System.out.printf("������ǰ�̸�: %s ���ο� ��ǰ�̸��Է�: ",tmp.getName());
				String newName = scn.next();
				System.out.printf("������ǰ����: %d ���ο� ��ǰ�����Է�: ",tmp.getPrice());
				int newPrice = scn.nextInt();
				System.out.printf("������ǰ������: %s, ���ο� ��ǰ�������Է�: ",tmp.getDetail());
				String newDetail = scn.next();
				int rs = dao.productUpdate(searchName, id, newName, newPrice, newDetail);

				if (rs!=1) {
					System.out.println("��ǰ������Ʈ ����");
					System.out.println("������ ��ǰ id: "+id);
					break;
				}else {
					System.out.println("��ǰ������Ʈ ����");
				}
			}
		}else {
			System.out.println("������Ʈ�� ��ǰ�� �����ϴ�.");
		}
	}
}
