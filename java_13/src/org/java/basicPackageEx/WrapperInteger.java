package org.java.basicPackageEx;

public class WrapperInteger {
	public static void main(String[] args) {
		int ii = 10;
		
		Integer i = new Integer(ii);
		
		System.out.println(i.bitCount(ii)); //2진수에서 1의 갯수
		System.out.println(i.intValue()); // Integer -> int
		System.out.println(i.doubleValue()); // Integer -> double

		int i2 = Integer.parseInt("111"); //문자열(숫자형태의 문자열) "111" -> 숫자
		System.out.println(i2);
		
		Integer i3 = Integer.parseInt("111");
		System.out.println(i3); //기본형 -> 객체형 : 자동박싱
		
		int i4 = Integer.valueOf("1111");
		System.out.println(i4);
		
		System.out.println(i3.toString());
		System.out.println(i2 == i3);
		
		//숫자형 -> 문자형
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
