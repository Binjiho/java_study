package org.java.lamda;

interface A{
	int m1();
}

interface B{
	int cal(int num1, int num2);
}

interface C{
	int sum(int num1, int num2);
	int sub(int num1, int num2);
}

public class LambdaEx2 {
	public static void main(String[] args) {
		/**
		 * 익명클래스
		 */
		A a1 = new A() {
			@Override
			public int m1() {
			
				return 0;
			}
		};
		int rs1 = a1.m1();
		System.out.println(rs1);
		
		B b1 = new B() {
			@Override
			public int cal(int num1, int num2) {
				return 0;
			}
		};
		b1.cal(1, 2);
		
		C c1 = new C() {
			@Override
			public int sum(int num1, int num2) {
				return num1+num2;
			}
			@Override
			public int sub(int num1, int num2) {
				return num1-num2;
			}
		};
		
		/**
		 * 람다식(익명메서드)
		 */
		A a2 = ()->{
			return 10;
		};
		int rs2 = a2.m1();
		System.out.println(rs2);
		
		B b2 = (int num1,int num2)->{
			return num1+num2;
		};
		b2.cal(10, 20);
		
		//구현 메서드가 하나여야만 함
//		C c2 = (int num1, int num2)->{
//			return num1;
//		};
	}
}
