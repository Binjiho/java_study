package org.java.basicPackageEx;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	public static void main(String[] args) {
		System.out.println("자바의 기본자료형 primitive type");
		//정수형
		byte b =10;
		short s =10;
		int i=10;
		long l=10;
		//실수형
		float f = (float)0.0;
		double d= 0.0;
		//문자형
		char c='c';
		//논리형
		boolean bool =false;
		
		//기본타입을 Wrapper(객체)타입으로 변환 : Boxing
		@SuppressWarnings("removal")
		Byte bb = new Byte(b); // byte -> Byte
		Short ss = new Short(s);
		Integer ii = new Integer(i);
		Long ll = new Long(l);
		Float ff = new Float((float)0.0);
		Double dd = new Double(0.0);
		Character cc = new Character(c);
		Boolean boolbool = new Boolean(bool);
		
		//Wrapper(객체형) -> 기본형 : Unboxing
		byte ubB = bb.byteValue();
		short ubS = ss.shortValue();
		int ubI = ii.intValue();
		long ubL = ll.longValue();
		float ubF = ff.floatValue();
		double ubD = dd.doubleValue();
		char ubC = cc.charValue();
		boolean ubBool = boolbool.booleanValue();

		
//		List<Integer> list = new ArrayList()<Integer>();
//		Map<String,Double> ajax = new HashMap<String,Double>();
	}
}
