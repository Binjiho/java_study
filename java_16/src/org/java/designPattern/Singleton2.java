package org.java.designPattern;

public class Singleton2 {
	//Bill Pugh Singleton Implementation

	private static Singleton2 INSTANCE;
	
	//������ private 
	private Singleton2() {
		
	}
	
	//����Ŭ���� -> static final = new ������();
	private static class SingletonHelper{
		private static final Singleton2 INSTANCE
		= new Singleton2(); 
	}
	
	public static Singleton2 getInstance() {
		return SingletonHelper.INSTANCE; // Ŭ���� ���
	}
}