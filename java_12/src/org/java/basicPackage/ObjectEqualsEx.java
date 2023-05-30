package org.java.basicPackage;

public class ObjectEqualsEx {
	public static void main(String[] args) {
		// == , equals의 차이
		String str1="member"; //리터럴 문자열 공간에 저장
		String str2="member";
		String str3= new String("member");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str1 == str3); //주소를 비교
		System.out.println(str1.equals(str3)); //값을 비교
	}
}
