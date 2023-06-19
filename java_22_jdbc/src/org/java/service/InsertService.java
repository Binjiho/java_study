package org.java.service;

import java.util.Scanner;

import org.java.dao.ProductDao;

public class InsertService implements ProductService {
	@Override
	public void executeQuery() {
		Scanner scn = new Scanner(System.in);
		System.out.println("��ǰ�̸��Է�: ");
		String name = scn.next();
		System.out.println("��ǰ�����Է�: ");
		int price = scn.nextInt();
		System.out.println("��ǰ�������Է�: ");
		String detail = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.productInsert(name,price,detail);
		
		if (rs!=1) {
			System.out.println("��ǰ��� ����");
		}else {
			System.out.println("��ǰ��� ����");
		}
	}
}
