package org.java.innerClass;

public class StaticClass {
	int size = 100;
    static int price = 5000;

    // static ���� Ŭ����
    static class PocketMonster {
	    static String name = "�̻��ؾ�";
	    int level = 10;
	
	    public static void getPoketMember() {
	        // �ܺ� Ŭ���� �ν��Ͻ� �ɹ� ���� �Ұ���
	        // System.out.println(size);
	        
	        // �ܺ� Ŭ���� ����ƽ ��� ���� ����
	        System.out.println(price);
			
	        // ���� Ŭ���� ����� ����ƽ �ɹ��� ���� ����
	        System.out.println(name);
	        // System.out.println(level);
        }
    }
}
