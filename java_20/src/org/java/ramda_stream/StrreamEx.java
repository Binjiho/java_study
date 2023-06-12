package org.java.ramda_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


class A{	
	
	static String m1(String el) {		
		return el;
	}
}

public class StrreamEx {

	public static void main(String[] args) {
		System.out.println("Stream -> JPA Paging ó��");		
		List<String> list1=new ArrayList<String>();
		
		list1.add("java");
		list1.add("oracle");
		list1.add("mysql");
		list1.add("servlet");
		list1.add("jsp");
		
		System.out.println();		
		
		Stream<String> stream3= list1.stream();	
							// return���� �ִ�.
		Stream<String> st1= stream3.map(A::m1);
		System.out.println();
		
		
		for(String el: list1) {
			System.out.println(el);
		}
		
		System.out.println();
		
		//�迭, ����Ʈ ������ �����͸� �׷�ȭ		
		 Stream<String> stream1= list1.stream();
//		stream1.forEach(el->{
//			System.out.println(el);
//		});
		stream1.forEach(el->System.out.println(el));
		
		System.out.println();
		
		Stream<String> stream2= list1.stream();
				//Ŭ����::�ż��� 
				//Stream�� ��Ұ� Ŭ������ �ż��带 ��� ����
		stream2.forEach(System.out::println);
		
	
		
	}
}
