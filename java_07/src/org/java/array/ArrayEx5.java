package org.java.array;

public class ArrayEx5 {
	public static void main(String[] args) {
	
		//string배열
		String[] arrStr = {"java", "jsp", "spring", "oracle", "mysql"};

		/*
		 * 객체 for문, foreach , each
		 */
		
		//기본 for문
//		for (int i=0; i<arrStr.length; i++) {
//			System.out.println(arrStr[i]);
//		}
		
		//객체 for문
		for(String items : arrStr) {
			System.out.println(items);
		}
		
		char[] javach = {'j','a','v','a'};
		//char[] -> string
		String str1 = new String(javach);
		System.out.println(str1);
		//string.valueOf
		String str2 = String.valueOf(javach);
		System.out.println(str2);
	}
}
