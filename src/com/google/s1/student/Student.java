package com.google.s1.student;

public class Student {
	// data 저장하는 용도

	String name;
	int number;
	int kor;
	int eng;
	int math;
	int total;//멤버변수 
	double avg;

	public void makeTotal() {
		this.total = this.kor + this.eng + this.math;
		this.avg =this.total/3.0;
		//--------멤버변수total
		//지역변수 total과 멤버변수 total 구분하기 위해 this 생략안할때도 있음 
		
		// 객체하나마다 참조변수 디스가 생성됨
		// 객체 내부에서만 사용 가능하고 외부에서는 ㄴ
		// this =만들어진 객체의 주소
	}

	public void hello() {
		System.out.println("안녕하세요.");
		

	}
}
