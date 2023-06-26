package org.web.dto;

import java.util.Date;

public class BoardDto {
	private long id;
	private String title;
	private String content;
	private String writer;
	private Date create_date;
	
	public BoardDto() {}

	public BoardDto(long id, String title, String content, String writer, Date create_date) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.create_date = create_date;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
}
