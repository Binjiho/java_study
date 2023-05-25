package org.java.inheritance;

public class Children extends Parent{
	
	public int num2;
	
	public Children(String str) {
		//먼저 부모생성자 호출
		super("자식생성자 불러오기전에 부모 생성자 호출");
		System.out.println(str);
	}
	
	@Override
	public void commonmethod() {
		System.out.println("자식클래스 메서드");
	}
	
}
