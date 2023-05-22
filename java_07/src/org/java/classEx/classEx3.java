package org.java.classEx;

public class classEx3 {
	public static void main(String[] args) {
		
		//인스턴스화
		classEx2 basicClass = new classEx2();
		System.out.println(basicClass.age);
		
		basicClass.age=20;
		basicClass.userId="jj";
		basicClass.userPw="1234";
		basicClass.method();
		
		//클래스멤버(정적static멤버)
		classEx2.staticMethod();
	}
}
