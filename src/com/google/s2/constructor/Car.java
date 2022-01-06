package com.google.s2.constructor;

public class Car {

	String brand;
	String comapany;
	int cc;
	String color;

//생성자 =	특수한 메서드 =>this 사용 가능
	public Car() { // 매개변수가 없는 생성자 = 기본생성자
		this("k9");
//		this.comapany = "kia";
//		this.brand = "k9";
//		this.cc = 5000;
//		this.color = "black";
	}

	public Car(String brand) { // 기본생성자가 아님
		// 매개변수로 선언된 변수는 지역변수
		this(brand, "black");
//		this.comapany = "kia";
//		this.brand = brand;
//		// 멤버변수 지역변수
//		this.cc = 5000;
//		this.color = "black";
	}

	public Car(String brand, String color) {
		this(brand, color, 5000);
//		this.comapany = "kia";
//		this.brand = brand;
//		this.cc = 5000;
//		this.color = color;
	}

	public Car(String brand, String color, int cc) {
		this.comapany = "kia";
		this.brand = brand;
		this.cc = cc;
		this.color = color;
	}

//멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(this.comapany);
		System.out.println(this.brand);
		System.out.println(this.cc);
		System.out.println(this.color);
	}

}
