package org.java.basicPackage;

public class ObjectEqualsEx {
	public static void main(String[] args) {
		// == , equals�� ����
		String str1="member"; //���ͷ� ���ڿ� ������ ����
		String str2="member";
		String str3= new String("member");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str1 == str3); //�ּҸ� ��
		System.out.println(str1.equals(str3)); //���� ��
	}
}
