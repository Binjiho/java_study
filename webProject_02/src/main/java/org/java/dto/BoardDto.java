package org.java.dto;

import java.sql.Timestamp;
import java.util.Date;

public class BoardDto {

	private Long id;
	private String title;
	private String content;
	private String writer;
	private int notice_yn;
	private int delete_yn;
	private Timestamp created_date; //LocalDateTime -> Timestamp
	private Timestamp modified_date; //LocalDateTime -> Timestamp
	
	public BoardDto() {}

	public BoardDto(Long id, String title, String content, String writer, int notice_yn, int delete_yn,
			Timestamp created_date, Timestamp modified_date) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.notice_yn = notice_yn;
		this.delete_yn = delete_yn;
		this.created_date = created_date;
		this.modified_date = modified_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public int getNotice_yn() {
		return notice_yn;
	}

	public void setNotice_yn(int notice_yn) {
		this.notice_yn = notice_yn;
	}

	public int getDelete_yn() {
		return delete_yn;
	}

	public void setDelete_yn(int delete_yn) {
		this.delete_yn = delete_yn;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Timestamp modified_date) {
		this.modified_date = modified_date;
	}


	
}
