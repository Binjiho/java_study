package org.web.dto;

import java.util.Date;

public class MemberDto {
	private long id;
	private String userid;
	private String userpw;
	private String htel;
	private Date create_date;
	
	public MemberDto() {}

	public MemberDto(long id, String userid, String userpw, String htel, Date create_date) {
		super();
		this.id = id;
		this.userid = userid;
		this.userpw = userpw;
		this.htel = htel;
		this.create_date = create_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getHtel() {
		return htel;
	}

	public void setHtel(String htel) {
		this.htel = htel;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
}
