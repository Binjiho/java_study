package org.java.classEx;

public class ClassMethod {

	//��ȯŸ��X, �Ű�����(�Ķ����)X
	public void method() {
		System.out.println("��ȯ ���� �޼ҵ�");
	}
	
	//��ȯŸ��O, �Ű�����X
	public int method2() {
		int sum = 10; //���� ���� 
		return sum;
	}
	
	//��ȯŸ��X, �Ű�����O
	public void method3(int a, int b) {
		//�������� sum, a, b
		int sum = a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	//��ȯŸ��O, �Ű�����O
	public int method4(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	public static void staticMethod(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	
}
