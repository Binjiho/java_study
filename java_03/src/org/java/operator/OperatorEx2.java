package org.java.operator;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		System.out.println("논리연산자 실습");

		/*
		 * 아이디, 비밀번호를 입력을 받아서 아이디 abcd 이면서 비밀번호 1111이면 콘솔에 로그인 성공, 그렇지 않으면 로그인 실패를
		 * 출력해보세요
		 */
//		Scanner scn = new Scanner(System.in);		
//		System.out.println("아이디 입력:");
//		String id = scn.next();
//		System.out.println("비밀번호 입력:");
//		String pw = scn.next();
//		
//		if (id.equals("abcd") && pw.equals("1111")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}

//		두 정수와 연산자 중 하나를 입력 받아 결과를 콘솔에 출력하시오
		
		Scanner scn = new Scanner(System.in);
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

	}

}
