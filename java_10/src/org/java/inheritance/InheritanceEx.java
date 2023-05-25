package org.java.inheritance;

public class InheritanceEx {
	public static void main(String[] args) {
		Parent p1 = new Parent("Parent Constructor");
//		p1.commonmethod();
		
		Children c1 = new Children("Children Constructor");
//		c1.commonmethod();
		c1.parentMethod();
	}
}
