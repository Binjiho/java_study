package org.java.varable;

import org.java.testclass.TestClass;

public class CastEx {
	public static void main(String[] args) {
		
		//new 객체 생성연산자
		TestClass tc = new TestClass();
		tc.method1(null, 0);
		System.out.println(tc);
		
		String str = new String("문자열");
		System.out.println(str);
	}
}
