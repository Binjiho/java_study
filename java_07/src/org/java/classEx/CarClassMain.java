package org.java.classEx;

public class CarClassMain {
	public static void main(String[] args) {
		CarClass car1 = new CarClass();
		car1.carName = "HCar";
		car1.carColor = "흰색";
		
		car1.carMethod();
		
		CarClass car2 = new CarClass();
		car2.carName = "BCar";
		car2.carColor = "검정색";
		
		car2.carMethod();
	}
}
