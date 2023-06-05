package org.java.designPattern;

public class Singleton2 {
	//Bill Pugh Singleton Implementation

	private static Singleton2 INSTANCE;
	
	//생성자 private 
	private Singleton2() {
		
	}
	
	//내부클래스 -> static final = new 생성자();
	private static class SingletonHelper{
		private static final Singleton2 INSTANCE
		= new Singleton2(); 
	}
	
	public static Singleton2 getInstance() {
		return SingletonHelper.INSTANCE; // 클래스 멤버
	}
}