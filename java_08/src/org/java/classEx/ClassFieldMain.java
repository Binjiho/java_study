package org.java.classEx;

import java.util.Date;

public class ClassFieldMain {
	public static void main(String[] args) {
		
		//Ŭ���� ��� ȣ��
		System.out.println(ClassField.MAIN_COLOR);
		ClassField c1 = new ClassField();
		c1.age=30;
		c1.name="�̸�";
		c1.arrImg= new String[5];
		c1.thisday = new Date();
		c1.memberDto = new MemberDto();
	}
}
