package org.java.classEx;

import java.util.Date;

public class ClassField {
	//필드
	//인스턴스 멤버(객체가 생성되어야만 사용가능)
	public Long id;
	public int age;
	public String name;
	public String[] arrImg;
	public Date thisday;
	public MemberDto memberDto;
	
	//클래스 멤버 도 가능
	public static final String MAIN_COLOR="YELLOW";
}
