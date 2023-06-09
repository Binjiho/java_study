package org.java.lamda;

interface Inter{
	void m1();
}

class InterSub implements Inter{
	@Override
	public void m1() {
		System.out.println("�������̵�");
	}
}

public class LambdaEx1 {
	public static void main(String[] args) {

		//�������̽� ���� ���1
		InterSub i = new InterSub();
		i.m1();
		
		//�������̽� ���� ���2 (�͸�Ŭ����)
		Inter i2 = new Inter() {
			@Override
			public void m1() {
				System.out.println("�͸�Ŭ���� �̿��ؼ� �������̽� ����");
			}
		};
		i2.m1();
		
		//�������̽� ���� ���3 (���� �͸�޼���)
		Inter i3 = ()->{
			System.out.println("����(�͸�޼���)�� �̿��ؼ� �������̽� ����");
		};
		i3.m1();
		
	}
}
