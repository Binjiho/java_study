package org.java.classEx;

import java.util.Scanner;

public class CalcurationMain {
	public static void main(String[] args) {
		Calcuration cal = new Calcuration();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� ����");
			System.out.println("ù��° ���� :");
			cal.a = scn.nextInt();
			System.out.println("�ι�° ���� :");
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
