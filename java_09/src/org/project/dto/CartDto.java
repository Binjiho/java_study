package org.project.dto;

public class CartDto {
	//private 필드
	private long id;
	private String itemName;
	private int itemCount;
	private int price;
	
	//기본 생성자 : NoArgsContructor
	public CartDto() {
		
	}
	//모든 필드가 매개변수인 생성자: AllArgsConstructor
	public CartDto(long id, String itemName, int itemCount, int price) {
		this.id = id;
		this.itemName = itemName;
		this.itemCount = itemCount;
		this.price = price;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void info() {
		System.out.println("장바구니번호: "+id);
		System.out.println("상품명: "+itemName);
		System.out.println("상품갯수: "+itemCount);
		System.out.println("가격: "+price);
	}
}
