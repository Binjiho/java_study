package org.java.collection;

class Generic<T> {
	T a;
	T m1 (T num1, T num2) {
		T sum = num1;
		return sum;
	}
}

class Member{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class GenericType {
	public static void main(String[] args) {
		
		Generic<Integer> gg = new Generic<Integer>();
		gg.a=10; //autoboxing (기본형 -> 객체형)
		
		System.out.println(gg.m1(10,20));
		
		Generic<Byte> g2 = new Generic<Byte>();
		Generic<Long> g3 = new Generic<Long>();
		Generic<Short> g4 = new Generic<Short>();
		Generic<String> g5 = new Generic<String>();
		
		Generic<Member> member1 = new Generic<Member>();
	}
}
