package org.java.classEx;

public class ClassMethodMain {
	public static void main(String[] args) {
		ClassMethod c1 = new ClassMethod();
		
		int sum = c1.method2();
		System.out.println(sum);
		System.out.println(c1.method2());
		
		c1.method3(100,200); //call by value
		
		int i = c1.method4(30, 20);
		System.out.println(i);
		
		
		ClassMethod.staticMethod();
		ClassMethod.staticMethod(10, 20);
	}
}
