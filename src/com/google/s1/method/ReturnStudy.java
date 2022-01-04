package com.google.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	// 멤버메서드 선언
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}
	public void test1() {
		System.out.println("void는 return이 없을 때 사용");
	}

	public String test3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next(); 
		//				호
		
		return name;
	}
	public Scanner test4() {
	Scanner sc= new Scanner(System.in);
	return sc;
	}
	
	
	public int test2() {
		Random random = new Random();
		// class Random type 변수 random
		// 랜덤클래스의 객체 만들기
		int num=random.nextInt();
		//num을 메인에 출력하고싶다 =호출한 곳으로 되돌려주고싶다. 
		System.out.println("test2:"+num);
		return num;
		
		
	}
}
