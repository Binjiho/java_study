package org.java.basicPackageEx;

public class WrapperInteger {
	public static void main(String[] args) {
		int ii = 10;
		
		Integer i = new Integer(ii);
		
		System.out.println(i.bitCount(ii)); //2�������� 1�� ����
		System.out.println(i.intValue()); // Integer -> int
		System.out.println(i.doubleValue()); // Integer -> double

		int i2 = Integer.parseInt("111"); //���ڿ�(���������� ���ڿ�) "111" -> ����
		System.out.println(i2);
		
		Integer i3 = Integer.parseInt("111");
		System.out.println(i3); //�⺻�� -> ��ü�� : �ڵ��ڽ�
		
		int i4 = Integer.valueOf("1111");
		System.out.println(i4);
		
		System.out.println(i3.toString());
		System.out.println(i2 == i3);
		
		//������ -> ������
		String str = Integer.toString(10);
//		System.out.println(str.getClass());
		if (str instanceof String) {
			System.out.println("String type");
		}
		
		
		Object var1 = Integer.valueOf("15");
        Object var2 = String.valueOf(var1);

        if (var1.getClass() == Integer.class) {
            System.out.println("var1 is an Integer");
        } else if (var1.getClass() == String.class) {
            System.out.println("var1 is a String");
        }
        if (var2.getClass() == Integer.class) {
            System.out.println("var2 is an Integer");
        } else if (var2.getClass() == String.class) {
            System.out.println("var2 is a String");
        }
		
	}
}
