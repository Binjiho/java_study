package org.java.varable;

public class VarEx03 {
	public static void main(String[] args) {
		System.out.println("참조형 타입(object)");
		
		String str1 = new String ("str1");
		String str2 = "->str2";
		System.out.println(str1.concat(str2));
		System.out.println(str2.length());
		
		int[] arr1 = {1,2,3};
		System.out.println(arr1);
	
//		int[] arr2 = {1,2,3,4};
//		System.out.println(arr2);
		
		//클래스	
//		TestClass t1 = new TestClass();
	}
}
