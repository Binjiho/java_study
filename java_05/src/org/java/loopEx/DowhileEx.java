package org.java.loopEx;

import java.util.Scanner;

public class DowhileEx {
	public static void main(String[] args) {
//		int i=0;
//		do {
//			System.out.println(i+" ");
//			i++;
//		}while(i<10);
		
		//�޴����� 1.���� 2.exit
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1.���� ���� 2.����");
			int init = scn.nextInt();
			if(init == 2) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
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
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		


	}
}
