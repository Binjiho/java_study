package org.java.innerClass;

public class InstanceClassMain {
	public static void main(String[] args) {
		
		InstanceClass ball = new InstanceClass(); // ���� �ܺ� Ŭ������ �ν��Ͻ�ȭ ���ְ�
		InstanceClass.PocketMonster poketmon = ball.new PocketMonster(); // �ܺ�Ŭ����.����Ŭ���� �������� ����Ŭ������ �ʱ�ȭ �Ͽ� ����� ���� �ִ�
        poketmon.getPoketmon();
        
        // ���� �ܰ踦 ���ٷ� ǥ��
        InstanceClass.PocketMonster poketmon2 = new InstanceClass().new PocketMonster();
	}
}
