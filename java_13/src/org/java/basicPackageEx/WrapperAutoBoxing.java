package org.java.basicPackageEx;

public class WrapperAutoBoxing {
	public static void main(String[] args) {
		Integer i1= new Integer(10); // Boxing ±âº»->°´Ã¼
		int i2 = i1.intValue(); //Unboxing
		Integer i3 = 10; // AutoBoxing
		int i4 = i1; // AutoUnboxing
	}
}
