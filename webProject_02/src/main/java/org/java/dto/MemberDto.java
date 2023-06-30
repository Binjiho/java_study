package org.java.dto;

import java.sql.Timestamp;
import java.util.Date;

public class MemberDto {
	private int id;
	private String user_id;
	private String user_pw;
	private String htel;
	private Timestamp created_date; //LocalDateTime -> Timestamp
	
	public MemberDto() {}

	public MemberDto(int id, String user_id, String user_pw, String htel, Timestamp created_date) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.htel = htel;
		this.created_date = created_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getHtel() {
		return htel;
	}

	public void setHtel(String htel) {
		this.htel = htel;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}	
	
}
