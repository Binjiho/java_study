package org.web.dto;

import java.util.Date;

public class EmployeeDto {
	private long id;
	private String name;
	private String depart;
	private String email;
	private Date created_date;
	
	public EmployeeDto() {}
	
	public EmployeeDto(long id, String name, String depart, String email, Date created_date) {
		super();
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.email = email;
		this.created_date = created_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
}
