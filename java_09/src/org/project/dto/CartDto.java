package org.project.dto;

public class CartDto {
	//private �ʵ�
	private long id;
	private String itemName;
	private int itemCount;
	private int price;
	
	//�⺻ ������ : NoArgsContructor
	public CartDto() {
		
	}
	//��� �ʵ尡 �Ű������� ������: AllArgsConstructor
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
		System.out.println("��ٱ��Ϲ�ȣ: "+id);
		System.out.println("��ǰ��: "+itemName);
		System.out.println("��ǰ����: "+itemCount);
		System.out.println("����: "+price);
	}
}
