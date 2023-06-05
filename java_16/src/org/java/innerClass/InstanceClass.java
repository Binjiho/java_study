package org.java.innerClass;

class InstanceClass {
    // �ν��Ͻ� ����
    int size = 100;
    int price = 5000;

    // �ν��Ͻ� ���� Ŭ����
    class PocketMonster {
        String name = "�̻��ؾ�";
        int level = 10;
        
        // static int cost = 100; - ����! �ν��Ͻ� ���� Ŭ�������� static ������ ������ �� ����.
        static final int cost = 100; // final static�� ����̹Ƿ� ���

        public void getPoketmon() {
            // ���ٸ� ��ġ���� �ܺ� Ŭ���� �ɹ� ���� ����
            System.out.println(size);
            System.out.println(price);

            // ���� Ŭ���� ���
            System.out.println(name);
            System.out.println(level);
            System.out.println(cost);
        }
    }
}
