package org.java.designPattern;

public class SingletonMain {
	public static void main(String[] args) {
		//�̱���1
		Singleton sig = Singleton.getInstance();
		
		//�̱��� Bill Pugh Singleton Implementation
		Singleton2 sig2 = Singleton2.getInstance();
	}
}
