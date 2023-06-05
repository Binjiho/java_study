package org.java.innerClass;

public class InstanceClassMain {
	public static void main(String[] args) {
		
		InstanceClass ball = new InstanceClass(); // 먼저 외부 클래스를 인스턴스화 해주고
		InstanceClass.PocketMonster poketmon = ball.new PocketMonster(); // 외부클래스.내부클래스 형식으로 내부클래스를 초기화 하여 사용할 수도 있다
        poketmon.getPoketmon();
        
        // 위의 단계를 한줄로 표현
        InstanceClass.PocketMonster poketmon2 = new InstanceClass().new PocketMonster();
	}
}
