package org.java.testclass;

public class TestClass {
	
	//필드(멤버변수)
	public int age; 	//인스턴스 멤버 (객체 생성시)
	public String name; //인스턴스 멤버 (객체 생성시)
	
	public static final int MAX_NUM=99999; //클래스 멤버(클래스 생성시), static

	public void method1(String operator, int pw) {
		int password = pw;
		System.out.println("this is method1");
	}
}
