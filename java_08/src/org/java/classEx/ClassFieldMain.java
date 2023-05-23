package org.java.classEx;

import java.util.Date;

public class ClassFieldMain {
	public static void main(String[] args) {
		
		//클래스 멤버 호출
		System.out.println(ClassField.MAIN_COLOR);
		ClassField c1 = new ClassField();
		c1.age=30;
		c1.name="이름";
		c1.arrImg= new String[5];
		c1.thisday = new Date();
		c1.memberDto = new MemberDto();
	}
}
