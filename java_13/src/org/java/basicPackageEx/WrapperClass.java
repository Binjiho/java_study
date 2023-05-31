package org.java.basicPackageEx;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	public static void main(String[] args) {
		System.out.println("�ڹ��� �⺻�ڷ��� primitive type");
		//������
		byte b =10;
		short s =10;
		int i=10;
		long l=10;
		//�Ǽ���
		float f = (float)0.0;
		double d= 0.0;
		//������
		char c='c';
		//����
		boolean bool =false;
		
		//�⺻Ÿ���� Wrapper(��ü)Ÿ������ ��ȯ : Boxing
		@SuppressWarnings("removal")
		Byte bb = new Byte(b); // byte -> Byte
		Short ss = new Short(s);
		Integer ii = new Integer(i);
		Long ll = new Long(l);
		Float ff = new Float((float)0.0);
		Double dd = new Double(0.0);
		Character cc = new Character(c);
		Boolean boolbool = new Boolean(bool);
		
		//Wrapper(��ü��) -> �⺻�� : Unboxing
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
