package org.java.innerClass;

public class LocalClass {
	
	public void LocalMethod(){
		
		class LocalClassBasic{
			void m1() {
				System.out.println("����Ŭ���� �޼���");
			}			
		}
		
		LocalClassBasic lb = new LocalClassBasic();
		lb.m1();
		
	}
}
