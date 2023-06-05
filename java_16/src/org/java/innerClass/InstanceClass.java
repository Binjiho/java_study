package org.java.innerClass;

class InstanceClass {
    // 인스턴스 변수
    int size = 100;
    int price = 5000;

    // 인스턴스 내부 클래스
    class PocketMonster {
        String name = "이상해씨";
        int level = 10;
        
        // static int cost = 100; - 에러! 인스턴스 내부 클래스에는 static 변수를 선언할 수 없다.
        static final int cost = 100; // final static은 상수이므로 허용

        public void getPoketmon() {
            // 별다른 조치없이 외부 클래스 맴버 접근 가능
            System.out.println(size);
            System.out.println(price);

            // 내부 클래스 멤버
            System.out.println(name);
            System.out.println(level);
            System.out.println(cost);
        }
    }
}
