package org.java.interfaceEx;

public interface InterfaceEx {
	
	//final ���
	public final static int MAXIMUM = 1000;
	
	//�߻�޼���
	public abstract void abstracMethod();
	
	//java 1.8�������� �߻�޼��常 ���
	//default �޼��� (������ ���� �� �� �ִ�)
	default void defaultMethod() {
		System.out.println("�����ص� �ǰ� ���ص� ��");
	}
}
