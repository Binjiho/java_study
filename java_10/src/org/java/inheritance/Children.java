package org.java.inheritance;

public class Children extends Parent{
	
	public int num2;
	
	public Children(String str) {
		//���� �θ������ ȣ��
		super("�ڽĻ����� �ҷ��������� �θ� ������ ȣ��");
		System.out.println(str);
	}
	
	@Override
	public void commonmethod() {
		System.out.println("�ڽ�Ŭ���� �޼���");
	}
	
}
