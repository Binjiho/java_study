package org.java.innerClass;

public class StaticClassMain {
	public static void main(String[] args) {
        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		StaticClass.PocketMonster poketmon = new StaticClass.PocketMonster();
        System.out.println(poketmon.level);
        System.out.println(StaticClass.PocketMonster.name);

        // 클래스.정적내부클래스.정적메소드()
        StaticClass.PocketMonster.getPoketMember();
    }
}
