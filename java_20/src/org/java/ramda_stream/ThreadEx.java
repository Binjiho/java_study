package org.java.ramda_stream;

class ThreadClass extends Thread{	
	int num=0;	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			num++;		
			try {
				System.out.println("Thread -> "+num);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}					
		}
	}
}

class Thread2 implements Runnable{
	
	int num=0;	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			num++;		
			try {
				System.out.println("Thread -> "+num);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}					
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		
		System.out.println("main������ ����");
		//1. Thread ���
//		 ThreadClass t1= new ThreadClass();
//		 t1.start();
		
		//2. Runnable �������̽� 
		Runnable r1=new Thread2();
		Thread t2= new Thread(r1);
		t2.start();
		
		//3.�͸�Ŭ����		
		Thread r2=new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("�͸�Ŭ���� �̿�");
			}
		});
		r2.start();

		System.out.println("���� ������"+Thread.currentThread());
		
		//4. ���ٽ�
		Thread r3=new Thread(()->System.out.println("���ٽ� �̿�"));
		r3.start();
		
		System.out.println("���� ������"+Thread.currentThread());
		System.out.println("Thread id->"+r3.getId());
		System.out.println("Thread name->"+r3.getName());
		
		try {		
			t2.join(); // ������ ����� ���� ��ٸ���.			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main������ ����");
	}
}











