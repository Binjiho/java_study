package org.java.operator;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		System.out.println("�������� �ǽ�");

		/*
		 * ���̵�, ��й�ȣ�� �Է��� �޾Ƽ� ���̵� abcd �̸鼭 ��й�ȣ 1111�̸� �ֿܼ� �α��� ����, �׷��� ������ �α��� ���и�
		 * ����غ�����
		 */
//		Scanner scn = new Scanner(System.in);		
//		System.out.println("���̵� �Է�:");
//		String id = scn.next();
//		System.out.println("��й�ȣ �Է�:");
//		String pw = scn.next();
//		
//		if (id.equals("abcd") && pw.equals("1111")) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}

//		�� ������ ������ �� �ϳ��� �Է� �޾� ����� �ֿܼ� ����Ͻÿ�
		
		Scanner scn = new Scanner(System.in);
		System.out.println("a ���� �Է� :");
		int a = scn.nextInt();
		System.out.printf("a= %d", a);
		
		System.out.println("\nb ���� �Է� :");
		int b = scn.nextInt();
		System.out.printf("b= %d", b);

		System.out.println("\n������(+,-,*,/,%) �Է� :");
		String c = scn.next();
		System.out.printf("c= %s", c);

		if (c.equals("+")) {
			int result = a + b;			
			System.out.printf("\na+b= %d", result);
		}else if (c.equals("-")) {
			int result = a - b;			
			System.out.printf("\na-b= %d", result);
		}else if (c.equals("*")) {
			int result = a * b;			
			System.out.printf("\na*b= %d", result);
		}else if (c.equals("/")) {
			int result = a / b;			
			System.out.printf("\na/b= %d", result);
		}else if (c.equals("%")) {
			int result = a % b;			
			System.out.printf("\na ������ b= %d", result);
		}else {
			System.out.println("������ �Է��� �߸���");
		}

	}

}
