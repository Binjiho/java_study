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
		System.out.println("Stream -> JPA Paging 처리");		
		List<String> list1=new ArrayList<String>();
		
		list1.add("java");
		list1.add("oracle");
		list1.add("mysql");
		list1.add("servlet");
		list1.add("jsp");
		
		System.out.println();		
		
		Stream<String> stream3= list1.stream();	
							// return문이 있다.
		Stream<String> st1= stream3.map(A::m1);
		System.out.println();
		
		
		for(String el: list1) {
			System.out.println(el);
		}
		
		System.out.println();
		
		//배열, 리스트 형식의 데이터를 그룹화		
		 Stream<String> stream1= list1.stream();
//		stream1.forEach(el->{
//			System.out.println(el);
//		});
		stream1.forEach(el->System.out.println(el));
		
		System.out.println();
		
		Stream<String> stream2= list1.stream();
				//클래스::매서드 
				//Stream의 요소가 클래스의 매서드를 모두 실행
		stream2.forEach(System.out::println);
		
	
		
	}
}
