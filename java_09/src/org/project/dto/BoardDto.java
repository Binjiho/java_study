package org.project.dto;

import java.util.Date;

public class BoardDto {
	
	//private 필드
	private long id;
	private String title;
	private String writer;
	private String content;
	private Date date;
	
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void info() {
		System.out.println("글번호: "+id+"글제목: "+title+"글내용: "+content);
	}
	
}
