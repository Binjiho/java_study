package org.java.innerClass;

public class LocalClass {
	
	public void LocalMethod(){
		
		class LocalClassBasic{
			void m1() {
				System.out.println("지역클래스 메서드");
			}			
		}
		
		LocalClassBasic lb = new LocalClassBasic();
		lb.m1();
		
	}
}
