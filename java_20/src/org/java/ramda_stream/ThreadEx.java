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
		
		System.out.println("main스레드 시작");
		//1. Thread 상상
//		 ThreadClass t1= new ThreadClass();
//		 t1.start();
		
		//2. Runnable 인터페이스 
		Runnable r1=new Thread2();
		Thread t2= new Thread(r1);
		t2.start();
		
		//3.익명클래스		
		Thread r2=new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("익명클래스 이용");
			}
		});
		r2.start();

		System.out.println("현재 스레드"+Thread.currentThread());
		
		//4. 람다식
		Thread r3=new Thread(()->System.out.println("람다식 이용"));
		r3.start();
		
		System.out.println("현재 스레드"+Thread.currentThread());
		System.out.println("Thread id->"+r3.getId());
		System.out.println("Thread name->"+r3.getName());
		
		try {		
			t2.join(); // 스레드 종료시 까지 기다린다.			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main스레드 종료");
	}
}











