package org.java.array;

public class ArrayEx {
	public static void main(String[] args) {
		
		//배열 생성1
		int[] arrInt = new int[5];
		arrInt[0]=10;
		arrInt[1]=20;
		arrInt[2]=30;
		arrInt[3]=40;
		arrInt[4]=50;
		
		System.out.println(arrInt);
		System.out.println(arrInt[0]);
		
		int[] arrInt2 = new int[5];
		for (int i=0; i<5; i++) {
			arrInt[i] = 100*(i+1);
			System.out.println(arrInt[i]);
		}
		
		//배열 초기화
		int[] array2 = new int[] {1,2,3,4,5};
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		int[] array3 = {1,2,3,4,5};
		for (int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
	}
}
