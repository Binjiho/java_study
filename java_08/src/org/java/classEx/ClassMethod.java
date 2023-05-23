package org.java.classEx;

public class ClassMethod {

	//반환타입X, 매개변수(파라미터)X
	public void method() {
		System.out.println("반환 없는 메소드");
	}
	
	//반환타입O, 매개변수X
	public int method2() {
		int sum = 10; //지역 변수 
		return sum;
	}
	
	//반환타입X, 매개변수O
	public void method3(int a, int b) {
		//지역변수 sum, a, b
		int sum = a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	//반환타입O, 매개변수O
	public int method4(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	public static void staticMethod(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	
}
