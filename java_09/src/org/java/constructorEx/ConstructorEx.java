package org.java.constructorEx;

public class ConstructorEx {
	//필드
	private String userId;
	
	//생성자
	public ConstructorEx() {
		this("s"); //생성자에서 다른 생성자 호출
		System.out.println("기본생성자");
	}
	public ConstructorEx(String str) {
		System.out.println("변형생성자");
	}
	
	//메서드
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId; //생성 시에 setter
	}
}
