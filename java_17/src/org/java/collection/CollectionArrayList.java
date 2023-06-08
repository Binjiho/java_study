package org.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(null);
		
		for(Integer items : al ) {
			System.out.println(items);
		}
		
		Iterator<Integer> iterator = al.iterator();
		while(iterator.hasNext()) {
			Integer items = iterator.next();
			System.out.println(items);
		}
	}
	
}
