package org.java.classEx;

//����������(����������)
public class MemberDto {
	//Ŭ������ ��� : �ʵ�, �޼���, ������
    
	//�ʵ�
	public Long id;
	public String email;
	public String phone;
	public String userId;
	public String userPw; //��й�ȣ ��ȣ (Spring Security)
	
	//�޼���
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	//������ : �����ڴ� ��ü�� ����
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
}
