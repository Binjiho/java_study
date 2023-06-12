package org.java.ramda_stream;

interface In1{	
	void m1();
}

class In1Sub implements In1{
	@Override
	public void m1() {
		System.out.println("오버라이딩 m1");
	}
}

public class RamdaEx {

	public static void main(String[] args) {
		System.out.println("Ramda-> 인터페이스 구현-> 무명(익명)클래스 -> 간소화");
		In1 i1=new In1Sub();//1. 구현 객체 이용해서 구현 
		i1.m1();
		//new 인터페이스(), new 추상클래스(), new 일반클래스()
	   In1 i2=new In1() { // 2. 익명 클래스 이용해서 구현
			@Override
			public void m1() {
				System.out.println("익명클래스 m1");
			}
		};
		i2.m1();
		
		 //3.람다식을 이용해서 구현 *** 자바스크립트등에서 활용(arrow function)
		In1 i3=()->{
			//익명매서드
			System.out.println("람다식으로 구현");
		};
		i3.m1();
		
	}
}
