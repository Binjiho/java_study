package org.java.innerClass;

public class AnonymousInterFaceMain{
	public static void main(String[] args) {
		
		//�͸�Ŭ���� ���
		AnonymousInterFace anony = new AnonymousInterFace() {
			@Override
			public void excuteQueryService() {
				System.out.println("�͸�Ŭ����");
			}			
		};
		anony.excuteQueryService();
		
		AnonymousClass dog = new AnonymousClass() {
            // @Override �޼ҵ�
            public String bark() {
                return "���� ¢���ϴ�";
            }
            
            // ���� ������ �޼ҵ�
            public String run() {
                return "�޸���";
            }

            @Override
			void m1() {
				// TODO Auto-generated method stub
				
			}
        };
        
        dog.bark();
        // dog.run(); // ! Error - �ܺο��� ȣ�� �Ұ���
		
		
		// Object Ŭ������ ��ȸ������ �͸� Ŭ������ �����Ͽ� ���� o �� ����
        Object o = new Object() {
            @Override
            public String toString() {
                return "������� toString �ٲٱ�";
            }
        };
		
        // �͸� Ŭ������ ��ü�� �������̵��� �޼��带 ���
        String txt = o.toString();
        System.out.println(txt);
	}
}
