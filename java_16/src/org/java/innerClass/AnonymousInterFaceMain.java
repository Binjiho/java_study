package org.java.innerClass;

public class AnonymousInterFaceMain{
	public static void main(String[] args) {
		
		//익명클래스 방식
		AnonymousInterFace anony = new AnonymousInterFace() {
			@Override
			public void excuteQueryService() {
				System.out.println("익명클래스");
			}			
		};
		anony.excuteQueryService();
		
		AnonymousClass dog = new AnonymousClass() {
            // @Override 메소드
            public String bark() {
                return "개가 짖습니다";
            }
            
            // 새로 정의한 메소드
            public String run() {
                return "달리기";
            }

            @Override
			void m1() {
				// TODO Auto-generated method stub
				
			}
        };
        
        dog.bark();
        // dog.run(); // ! Error - 외부에서 호출 불가능
		
		
		// Object 클래스를 일회성으로 익명 클래스로 선언하여 변수 o 에 저장
        Object o = new Object() {
            @Override
            public String toString() {
                return "마음대로 toString 바꾸기";
            }
        };
		
        // 익명 클래스의 객체의 오버라이딩한 메서드를 사용
        String txt = o.toString();
        System.out.println(txt);
	}
}
