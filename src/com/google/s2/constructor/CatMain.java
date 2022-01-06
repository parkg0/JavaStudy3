package com.google.s2.constructor;

public class CatMain {

	public static void main(String[] args) {

		// 변수 선언= new 생성자호출
		Car car = new Car(); // 객체를 만들때 딱 한번 호출
//		car.brand="k7";
//		car.comapany="kia";
//		car.cc=2000;
//		car.info();
		Car car2 = new Car("k5");

		// car.Car(); =error!!!!!!!!!!!!
		car2.info();
		
Car car3 = new Car("k3","white");
car3.info();
	
Car car4 = new Car("k5","yellow",2000);
car4.info();

Car car5 = new Car("k9","red",5000);
	}
}
