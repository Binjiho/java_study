package org.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Board {
	long id;
	String title;
	String content;
	
	public Board(long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

public class CollectionMap {
	public static void main(String[] args) {
		
		List<Board> boardList = new ArrayList<Board>();
		boardList.add(new Board(1L,"����1","����1"));
		boardList.add(new Board(2,"����2","����2"));
		boardList.add(new Board(3,"����3","����3"));
		boardList.add(new Board(4,"����4","����4"));
		
		Map<String, List<Board>> boardMap = new HashMap<String, List<Board>>();
		
		boardMap.put("�Խñ� ���", boardList);

//		Set<String> set = boardMap.keySet();
//		Iterator<String> iterator = set.iterator();
//
//		while(iterator.hasNext())
//		{
//			String key = iterator.next();
//			List<Board> bList = boardMap.get(key);
//			
//			for (Board board : bList) {
//				System.out.println(String.format("�Խñ۹�ȣ: %s, Ÿ��Ʋ: %s ����: %s", board.getId(), board.getTitle(), board.getContent() ));
//			}
//		}
		
		for( String strKey : boardMap.keySet() ){
			List<Board> bList = boardMap.get(strKey);
			for (Board board : bList) {
				System.out.println(String.format("�Խñ۹�ȣ: %s, Ÿ��Ʋ: %s ����: %s", board.getId(), board.getTitle(), board.getContent() ));
			}
		}
		
		// Java 1.8 �̻�
		boardMap.forEach((strKey, strValue)->{
			List<Board> bList = boardMap.get(strKey);
			for (Board board : bList) {
				System.out.println(String.format("�Խñ۹�ȣ: %s, Ÿ��Ʋ: %s ����: %s", board.getId(), board.getTitle(), board.getContent() ));
			}
		});

	}
}
