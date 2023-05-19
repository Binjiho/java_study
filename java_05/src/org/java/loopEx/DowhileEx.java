package org.java.loopEx;

import java.util.Scanner;

public class DowhileEx {
	public static void main(String[] args) {
//		int i=0;
//		do {
//			System.out.println(i+" ");
//			i++;
//		}while(i<10);
		
		//메뉴선택 1.계산기 2.exit
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1.계산기 실행 2.종료");
			int init = scn.nextInt();
			if(init == 2) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("a 정수 입력 :");
			int a = scn.nextInt();
			System.out.printf("a= %d", a);
			
			System.out.println("\nb 정수 입력 :");
			int b = scn.nextInt();
			System.out.printf("b= %d", b);

			System.out.println("\n연산자(+,-,*,/,%) 입력 :");
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
				System.out.printf("\na 나머지 b= %d", result);
			}else {
				System.out.println("연산자 입력이 잘못됨");
			}
			System.out.println("종료되었습니다.");
			break;
		}
		


	}
}
