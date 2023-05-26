package org.java.interfaceEx;

public class InterfaceSub implements InterfaceEx{

	//interface의 abstract메서드는 필수 구현
	@Override
	public void abstracMethod() {
		// TODO Auto-generated method stub
	}

	
	//interface의 default메서드는 선택적 구현
	@Override
	public void defaultMethod() {
		InterfaceEx.super.defaultMethod();
	}
	
	

}
