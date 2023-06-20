package org.java.dto;

import java.util.Date;

public class ProductDto {
	private Long id;
	private String name;
	private int price;
	private String detail;
	private Date create_date;
	
	public ProductDto() {}
	
	public ProductDto(Long id, String name, int price, String detail, Date create_date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.create_date = create_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
}
