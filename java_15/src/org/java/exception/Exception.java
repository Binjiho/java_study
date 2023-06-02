package org.java.exception;

import java.util.InputMismatchException;

public class Exception {
	public static void main(String[] args) {
//		int i = 100;
		int[] arrI = new int[5];
		
		try {
//			System.out.println(i/0);
			for (int i=0; i<6; i++) {
				arrI[i] = 10;
				System.out.println(arrI[i]);
			}
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println( e.getMessage() );
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
			
		try {
			System.out.println(Integer.parseInt("삼백"));			
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}finally {
			
		}
		
		System.out.println("정상 실행");
	}
}
