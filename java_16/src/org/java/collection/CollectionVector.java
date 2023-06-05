package org.java.collection;

import java.util.List;
import java.util.Vector;

public class CollectionVector {
	public static void main(String[] args) {
		List<Integer> v1 = new Vector<Integer>();
		
		v1.add(10);
		v1.add(20);
		v1.add(30);
		//System.out.println(v1.size());
		//System.out.println(v1.get(0));
		v1.add(1,100);
		
		List<Integer> v2 = new Vector<Integer>();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		
		v1.addAll(v2);
		
		v1.remove(1);
		for(Integer items: v1) {
			System.out.println(items);
		}
//		System.out.println(v1.indexOf(30));
		
		v1.clear();
		System.out.println(v1.size());
		System.out.println(v1.isEmpty());
	}
}
