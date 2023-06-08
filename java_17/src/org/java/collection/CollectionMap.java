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
		boardList.add(new Board(1L,"제목1","내용1"));
		boardList.add(new Board(2,"제목2","내용2"));
		boardList.add(new Board(3,"제목3","내용3"));
		boardList.add(new Board(4,"제목4","내용4"));
		
		Map<String, List<Board>> boardMap = new HashMap<String, List<Board>>();
		
		boardMap.put("게시글 목록", boardList);

//		Set<String> set = boardMap.keySet();
//		Iterator<String> iterator = set.iterator();
//
//		while(iterator.hasNext())
//		{
//			String key = iterator.next();
//			List<Board> bList = boardMap.get(key);
//			
//			for (Board board : bList) {
//				System.out.println(String.format("게시글번호: %s, 타이틀: %s 내용: %s", board.getId(), board.getTitle(), board.getContent() ));
//			}
//		}
		
		for( String strKey : boardMap.keySet() ){
			List<Board> bList = boardMap.get(strKey);
			for (Board board : bList) {
				System.out.println(String.format("게시글번호: %s, 타이틀: %s 내용: %s", board.getId(), board.getTitle(), board.getContent() ));
			}
		}
		
		// Java 1.8 이상
		boardMap.forEach((strKey, strValue)->{
			List<Board> bList = boardMap.get(strKey);
			for (Board board : bList) {
				System.out.println(String.format("게시글번호: %s, 타이틀: %s 내용: %s", board.getId(), board.getTitle(), board.getContent() ));
			}
		});

	}
}
