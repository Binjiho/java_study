package org.java.inheritance;

public class Parent {
	
	public int num1;
	
	public Parent(String str) {
		System.out.println(str);
	}
	
	public void commonmethod() {
		System.out.println("부모클래스 메서드");
	}
	
	public void parentMethod() {
		System.out.println("부모의 메서드");
	}
}
