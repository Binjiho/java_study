package org.java.varable;

import org.java.testclass.TestClass;

public class CastEx {
	public static void main(String[] args) {
		
		//new ��ü ����������
		TestClass tc = new TestClass();
		tc.method1(null, 0);
		System.out.println(tc);
		
		String str = new String("���ڿ�");
		System.out.println(str);
	}
}
