package com.google.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("MainMethod Start");
System.out.println("conflict test");
//-----------------------------


//객체 생성코드
//new 클래스명();

ReturnStudy rs= new ReturnStudy();

//멤버메서드 접근
//참조변수명.멤버들

rs.test1();

int count=rs.test2();
//random한 숫자를 여기다 출력하고싶어 
System.out.println("main:"+count);


String name =rs.test3();
System.out.println("test3:"+name);

double a=Math.random();

Scanner sc=rs.test4(); //test4호출 하면 리턴으로 데이터타입 스캐너인 변수를 내
System.out.println("나이 입력");
int age =sc.nextInt();
System.out.println("Math.random:"+a);
//-------------------
System.out.println("MainMethod Finish");
	}

}
