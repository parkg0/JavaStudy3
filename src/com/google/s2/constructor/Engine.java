package com.google.s2.constructor;

public class Engine {

	String name = "v1";
	String fuel = "f1";
	{
		System.out.println("초기화블럭");
		this.name = "v2";
		this.fuel = "f2";
	}

	public Engine() {
		System.out.println("생성자 실행");
		this.name = "v3";
		this.fuel = "f3";
	}
	

	public void info() {
		System.out.println(this.name);
		System.out.println(this.fuel);
	}
}
