package org.java.basicPackage;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class BasicPackage {
	public BasicPackage() {
		System.out.println("�⺻������");
	}
	
//	static void m1() {
//		System.out.println("m1");
//	}
	public static void main(String[] args) {

		Object o     = null; //�ڹ��� �ֻ��� Ŭ����(����Ŭ����)
		System s     = null; //ǥ�� �����
		Class  c     = null; //JDBC����̹� ã��(Ŭ������ �޸𸮷ε�)
		Integer i    = null; //Wrapper Ŭ����(8����) �⺻Ÿ���� ��üȭ
		String str   = null; //���ڿ� ����(�����Ұ�)
		StringBuffer sb = null; //���ڿ� ����(��������)
		Math m       = null; //math
		
		String[] ab = {"abcd","1234"};
		Arrays.asList(ab);         //�迭�� ���� (��,����,ã��)
		Calendar cl = null;         //�ü�� �ð�
		Date d = null;             //��¥�� �ð�
		StringTokenizer st = null; // Ư�����ڿ� �������� ���ڿ� ����
		Random r = null;              //���� ����
	}
}
