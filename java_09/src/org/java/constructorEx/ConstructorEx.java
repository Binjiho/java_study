package org.java.constructorEx;

public class ConstructorEx {
	//�ʵ�
	private String userId;
	
	//������
	public ConstructorEx() {
		this("s"); //�����ڿ��� �ٸ� ������ ȣ��
		System.out.println("�⺻������");
	}
	public ConstructorEx(String str) {
		System.out.println("����������");
	}
	
	//�޼���
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId; //���� �ÿ� setter
	}
}
