package org.java.classEx;

public class classEx3 {
	public static void main(String[] args) {
		
		//�ν��Ͻ�ȭ
		classEx2 basicClass = new classEx2();
		System.out.println(basicClass.age);
		
		basicClass.age=20;
		basicClass.userId="jj";
		basicClass.userPw="1234";
		basicClass.method();
		
		//Ŭ�������(����static���)
		classEx2.staticMethod();
	}
}
