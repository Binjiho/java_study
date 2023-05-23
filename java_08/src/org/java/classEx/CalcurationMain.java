package org.java.classEx;

import java.util.Scanner;

public class CalcurationMain {
	public static void main(String[] args) {
		Calcuration cal = new Calcuration();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("계산기 실행");
			System.out.println("첫번째 정수 :");
			cal.a = scn.nextInt();
			System.out.println("두번째 정수 :");
			cal.b = scn.nextInt();
			System.out.println("operator :");
			cal.op = scn.next();
			
			if(cal.op.equals("+")) {
				cal.add();
			}else if(cal.op.equals("-")) {
				cal.minus();
			}else if(cal.op.equals("*")) {
				cal.multi();
			}else if(cal.op.equals("/")) {
				cal.div();
			}
			break;
		}
	}
}
