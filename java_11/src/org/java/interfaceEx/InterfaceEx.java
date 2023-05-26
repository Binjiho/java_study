package org.java.interfaceEx;

public interface InterfaceEx {
	
	//final 상수
	public final static int MAXIMUM = 1000;
	
	//추상메서드
	public abstract void abstracMethod();
	
	//java 1.8이전에는 추상메서드만 멤버
	//default 메서드 (구현을 선택 할 수 있다)
	default void defaultMethod() {
		System.out.println("구현해도 되고 안해도 됨");
	}
}
