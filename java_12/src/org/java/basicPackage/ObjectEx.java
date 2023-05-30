package org.java.basicPackage;

class ObjectSub{
	
	private int age;
	private String name;
	
	public ObjectSub() {

	}
	public ObjectSub(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		ObjectSub os1 = new ObjectSub();
		System.out.println(os1.hashCode());
		System.out.println(os1.getClass());
		System.out.println(os1.getClass().getName());
		System.out.println(os1.getClass().getModifiers());
		System.out.println(os1.getClass().getPackageName());
		System.out.println(os1.toString());
		
		ObjectSub os2 = new ObjectSub();
		System.out.println(os2.hashCode());
		System.out.println(os2.getClass());
		System.out.println(os1.getClass()==os2.getClass());
		System.out.println(os1.toString()==os2.toString());
	}
}
