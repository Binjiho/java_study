package org.java.interfaceEx2;

interface Inter {
	public static final int num=10; // final ��� -> ���� �ʱ�ȭ
	public abstract void abMethod(); //�߻� �޼��� -> �ݵ�� �������̵� ����
	//1.8���Ŀ� �������̵� ���� �� �� �ִ�.
	default void defaultMethod() {
		System.out.println("defaultMethod");
	}
}

interface Inter2{
	int num2 = 100;   //public final int num2
	void abMethod2(); //public abstract void abMethod2()
}

// Class extends Class : ���� ���
// interface extends interface2, interface3 : ���� ���
interface Inter3 extends Inter, Inter2{
	public abstract int abMethod3(int a);
}

//Class implements Interface : �������̽� �߻�޼��带 ����� ���� �������̵� �Ѵ�.
class InterfaceEx1 implements Inter{
	@Override
	public void abMethod() {	
	}
}
public class InterfaceEx2 implements Inter, Inter2, Inter3{
	@Override
	public void abMethod() {		
	}
	@Override
	public void abMethod2() {	
	}
	@Override
	public int abMethod3(int a) {	
		return a;
	}
	
	public static void main(String[] args) {
		new InterfaceEx1();
		
		Inter i1 = new InterfaceEx2();
		i1.abMethod();
		Inter2 i2 = new InterfaceEx2();
		i2.abMethod2();
		Inter3 i3 = new InterfaceEx2();
		i3.abMethod();
		i3.abMethod2();
	}
}
