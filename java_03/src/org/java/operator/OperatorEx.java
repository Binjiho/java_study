package org.java.operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// primitive type ������ ����
		int i = 10;
		int i2 = 10 + (10 * 5);

		// ��ü�� type ��ü�� �ּҰ� ����
		String str = new String("���ڿ�");//new�� ��ü ������ heap�� ���� 
		
		// ���ڿ� ��		
		String str2 = "���ڿ�";//���ڿ� ���ͷ��� ���� (����)
		String str3 = "���ڿ�";//���ڿ� ���ͷ��� ���� (����)

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str==str2);
		System.out.println(str.equals(str2));

		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));

		// �� ������ �Է��� �޾Ƽ� �񱳿����� ���� �ϰ� ����� �ֿܼ� ���
		/*
		 * Scanner scn = new Scanner(System.in); System.out.println("a ���� �Է� :"); int a
		 * = scn.nextInt(); System.out.printf("a= %d", a);
		 * System.out.println("\nb ���� �Է� :"); int b = scn.nextInt();
		 * System.out.printf("b= %d", b);
		 * 
		 * int r1 = a + b; System.out.printf("\na+b= %d", r1); int r2 = a - b;
		 * System.out.printf("\na-b= %d", r2); int r3 = a * b;
		 * System.out.printf("\na*b= %d", r3); int r4 = a / b;
		 * System.out.printf("\na/b= %d", r4);
		 */
		
		String id = new String("ddddd");
		if (id.equals("ddddd")) {
			System.out.println("���̵� ��ġ�մϴ�.");
		}else {
			System.out.println("���̵� ��ġ�����ʽ��ϴ�.");
		}
	}

}
