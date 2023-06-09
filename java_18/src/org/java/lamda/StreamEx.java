package org.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class StreamEx {
	public static void main(String[] args) {
		
		String[] arr = {"java","spring","boot"};
		List<String> list = Arrays.asList(arr);
		//List<String> list = new ArrayList<String>();
		
		//foreach
		for (String el : list) {
			System.out.println(el);
		}
		
		//Iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Stream
		Stream<String> stream = list.stream();
		stream.forEach( el->
			System.out.println(el)
		);
		//°´Ã¼::°´Ã¼¸Þ¼­µå
		list.stream().forEach(System.out::println);
	}
}
