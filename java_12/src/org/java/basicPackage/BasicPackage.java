package org.java.basicPackage;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class BasicPackage {
	public BasicPackage() {
		System.out.println("기본생성자");
	}
	
//	static void m1() {
//		System.out.println("m1");
//	}
	public static void main(String[] args) {

		Object o     = null; //자바의 최상위 클래스(슈퍼클래스)
		System s     = null; //표준 입출력
		Class  c     = null; //JDBC드라이버 찾기(클래스를 메모리로드)
		Integer i    = null; //Wrapper 클래스(8가지) 기본타입을 객체화
		String str   = null; //문자열 저장(수정불가)
		StringBuffer sb = null; //문자열 저장(수정가능)
		Math m       = null; //math
		
		String[] ab = {"abcd","1234"};
		Arrays.asList(ab);         //배열을 조작 (비교,정렬,찾기)
		Calendar cl = null;         //운영체제 시간
		Date d = null;             //날짜와 시간
		StringTokenizer st = null; // 특정문자열 기준으로 문자열 추출
		Random r = null;              //난수 추출
	}
}
