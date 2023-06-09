package org.java.lamda;

interface Inter{
	void m1();
}

class InterSub implements Inter{
	@Override
	public void m1() {
		System.out.println("오버라이드");
	}
}

public class LambdaEx1 {
	public static void main(String[] args) {

		//인터페이스 구현 방법1
		InterSub i = new InterSub();
		i.m1();
		
		//인터페이스 구현 방법2 (익명클래스)
		Inter i2 = new Inter() {
			@Override
			public void m1() {
				System.out.println("익명클래스 이용해서 인터페이스 구현");
			}
		};
		i2.m1();
		
		//인터페이스 구현 방법3 (람다 익명메서드)
		Inter i3 = ()->{
			System.out.println("람다(익명메서드)를 이용해서 인터페이스 구현");
		};
		i3.m1();
		
	}
}
