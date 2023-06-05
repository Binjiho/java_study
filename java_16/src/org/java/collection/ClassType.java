package org.java.collection;

class A{
	int a;
	int m1 (int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
}

class B{
	String str;
	String m2(String s1, String s2) {
		String s3 = s1+s2;
		return s3;
	}
}

public class ClassType {
	public static void main(String[] args) {
		A ac = new A();
		ac.a = 10;
		int sum = ac.m1(ac.a, 10);
		System.out.println(sum);
		
	}
}
