package org.java.classEx;

public class StaticClassEx {
	//�ʵ�
	public int num1; //�ν��Ͻ� ���
	public static int num2; //Ŭ����(static) ���
	
	//�޼���
	public void m1() {
		num1=10;
		num2=20;
	}
	public static void m2() {
//		num1=10; //Ŭ����(static) �޼��忡�� Ŭ����(static) ����� ���� ����
		num2=20;		
	}
}
