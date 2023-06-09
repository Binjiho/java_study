package org.java.thread;

// Thread ����� ��� 1 : Thread ���
class ThreadSub extends Thread{
	@Override
	public void run() {
		super.run();
	}
}

//Thread ����� ��� 2 : Runnable �������̽� ���� ���
class ThreadSub2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}


public class ThreadEx {
	public static void main(String[] args) {
		ThreadSub t1 = new ThreadSub();
		t1.start();
		
		Runnable r1 = new ThreadSub2();
		Thread t2 = new Thread(r1);
		t2.start();
	}
}
