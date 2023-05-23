package org.java.classEx;

public class OverloadingEx {
	
	public void method(){
		System.out.println("method");
	}
	public void method(int i){
		System.out.println("method");
	}
	public void method(int i, int i2){
		System.out.println("method");
	}
	
	//반환 타입과 상관없다
//	public int method(){
//		System.out.println("method");
//	}
}
