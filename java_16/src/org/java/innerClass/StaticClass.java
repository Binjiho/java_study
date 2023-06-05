package org.java.innerClass;

public class StaticClass {
	int size = 100;
    static int price = 5000;

    // static 내부 클래스
    static class PocketMonster {
	    static String name = "이상해씨";
	    int level = 10;
	
	    public static void getPoketMember() {
	        // 외부 클래스 인스턴스 맴버 접근 불가능
	        // System.out.println(size);
	        
	        // 외부 클래스 스태틱 멤버 접근 가능
	        System.out.println(price);
			
	        // 내부 클래스 멤버도 스태틱 맴버만 접근 가능
	        System.out.println(name);
	        // System.out.println(level);
        }
    }
}
