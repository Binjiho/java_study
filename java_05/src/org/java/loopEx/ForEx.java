package org.java.loopEx;

public class ForEx {
	public static void main(String[] args) {
		//1~10���� for���� ���
		for (int i=0; i<10; i++) {
//			System.out.println(i);
		}
		
		//1~10���� for���� ¦���� ���
		for (int i=0; i<10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
