package org.java.utilEx;

import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
		int minNum = Math.min(100, 200);
		
		int absNum = Math.abs(-100); //Àý´ë°ª
		
		int ceilNum = (int) Math.ceil(11.2);
		System.out.println(ceilNum);
		System.out.println(Math.ceil(11.2));
		
		int floorNum = (int) Math.floor(11.2);
		System.out.println(floorNum);
		
		int roundNum = (int) Math.round(11.2);
		System.out.println(roundNum);
		
		//Math.randon
		for (int i=0;i<10;i++) {
			System.out.println( (int)(Math.random()*45)+1 );
		}
		
		Random r = new Random();
		int ri = r.nextInt(45); // 0~44
		System.out.println(ri);
		
	}
}
