package org.java.ramda_stream;

interface In1{	
	void m1();
}

class In1Sub implements In1{
	@Override
	public void m1() {
		System.out.println("�������̵� m1");
	}
}

public class RamdaEx {

	public static void main(String[] args) {
		System.out.println("Ramda-> �������̽� ����-> ����(�͸�)Ŭ���� -> ����ȭ");
		In1 i1=new In1Sub();//1. ���� ��ü �̿��ؼ� ���� 
		i1.m1();
		//new �������̽�(), new �߻�Ŭ����(), new �Ϲ�Ŭ����()
	   In1 i2=new In1() { // 2. �͸� Ŭ���� �̿��ؼ� ����
			@Override
			public void m1() {
				System.out.println("�͸�Ŭ���� m1");
			}
		};
		i2.m1();
		
		 //3.���ٽ��� �̿��ؼ� ���� *** �ڹٽ�ũ��Ʈ��� Ȱ��(arrow function)
		In1 i3=()->{
			//�͸�ż���
			System.out.println("���ٽ����� ����");
		};
		i3.m1();
		
	}
}
