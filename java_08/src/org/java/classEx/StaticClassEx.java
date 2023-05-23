package org.java.classEx;

public class StaticClassEx {
	//필드
	public int num1; //인스턴스 멤버
	public static int num2; //클래스(static) 멤버
	
	//메서드
	public void m1() {
		num1=10;
		num2=20;
	}
	public static void m2() {
//		num1=10; //클래스(static) 메서드에는 클래스(static) 멤버만 접근 가능
		num2=20;		
	}
}
