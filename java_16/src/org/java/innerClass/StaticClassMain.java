package org.java.innerClass;

public class StaticClassMain {
	public static void main(String[] args) {
        // ����ƽ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		StaticClass.PocketMonster poketmon = new StaticClass.PocketMonster();
        System.out.println(poketmon.level);
        System.out.println(StaticClass.PocketMonster.name);

        // Ŭ����.��������Ŭ����.�����޼ҵ�()
        StaticClass.PocketMonster.getPoketMember();
    }
}
