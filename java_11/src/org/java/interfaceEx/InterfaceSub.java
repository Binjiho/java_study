package org.java.interfaceEx;

public class InterfaceSub implements InterfaceEx{

	//interface�� abstract�޼���� �ʼ� ����
	@Override
	public void abstracMethod() {
		// TODO Auto-generated method stub
	}

	
	//interface�� default�޼���� ������ ����
	@Override
	public void defaultMethod() {
		InterfaceEx.super.defaultMethod();
	}
	
	

}
