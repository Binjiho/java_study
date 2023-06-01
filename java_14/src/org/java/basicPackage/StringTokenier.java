package org.java.basicPackage;

import java.util.StringTokenizer;

public class StringTokenier {
	public static void main(String[] args) {
		
		String url = "http://localhost:8080?userId=m111&userPw=1111";
		String payload = "userId=m111&userPw=1111&email=abc@gmail.com";
		
		StringTokenizer token = new StringTokenizer(payload,"&");
		System.out.println("토큰숫자 : "+token.countTokens());
		
		while(token.hasMoreTokens()) {
			String tk = token.nextToken();
			System.out.println(tk);
		}
	}
}
