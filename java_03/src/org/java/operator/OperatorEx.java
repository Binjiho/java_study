package org.java.operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		// primitive type 참조값 대입
		int i = 10;
		int i2 = 10 + (10 * 5);

		// 객체형 type 객체의 주소값 대입
		String str = new String("문자열");//new로 객체 생성시 heap에 저장 
		
		// 문자열 비교		
		String str2 = "문자열";//문자열 리터럴에 저장 (공유)
		String str3 = "문자열";//문자열 리터럴에 저장 (공유)

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str==str2);
		System.out.println(str.equals(str2));

		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));

		// 두 정수를 입력을 받아서 비교연산을 수행 하고 결과를 콘솔에 출력
		/*
		 * Scanner scn = new Scanner(System.in); System.out.println("a 정수 입력 :"); int a
		 * = scn.nextInt(); System.out.printf("a= %d", a);
		 * System.out.println("\nb 정수 입력 :"); int b = scn.nextInt();
		 * System.out.printf("b= %d", b);
		 * 
		 * int r1 = a + b; System.out.printf("\na+b= %d", r1); int r2 = a - b;
		 * System.out.printf("\na-b= %d", r2); int r3 = a * b;
		 * System.out.printf("\na*b= %d", r3); int r4 = a / b;
		 * System.out.printf("\na/b= %d", r4);
		 */
		
		String id = new String("ddddd");
		if (id.equals("ddddd")) {
			System.out.println("아이디가 일치합니다.");
		}else {
			System.out.println("아이디가 일치하지않습니다.");
		}
	}

}
