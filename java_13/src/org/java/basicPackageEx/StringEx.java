package org.java.basicPackageEx;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {

		//substring
		String str = "java 2023 project";
		System.out.println(str.substring(10));
		

		/**
		 * quiz ���ڿ����� �ϳ� substring()�� �̿��� .do�� ������ü �ֿܼ� ����Ͻÿ�.
		 */
		String query1 = "/register.do";
		String query2 = "/list.do";
		String query3 = "/modify.do";
		String query4 = "/delete.do";
		
		String[] query = new String[4];
		query[0]="/register.do";
		query[1]="/list.do";
		query[2]="/modify.do";
		query[3]="/delete.do";
		
		for(int i=0; i<query.length; i++) {
			System.out.println(query[i].substring(0,query[i].length()-3));
		}

	}
}
