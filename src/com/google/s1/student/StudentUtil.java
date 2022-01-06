package com.google.s1.student;

import java.util.Scanner;

public class StudentUtil {// 학생 객체를 생성하고 정보를 입력받는
	Scanner sc; //스캐너를 멤버변수로 선언 

public StudentUtil() {
	this.sc= new Scanner(System.in);
}
	
	Student student;
	public void initUtil() { //init사용하기전에 초기화 
		this.sc=new Scanner(System.in); //this 생략가
	}

	public Student search(Student[] students) {

		System.out.println("학생의 번호를 입력하세요");
		int num = sc.nextInt();

		Student student = null;

		for (int i = 0; i < students.length; i++) {
			if (num == students[i].number) {
				System.out.println("find");
				student = students[i];
				break;
			}

		}
		return student;
	}

	public Student[] makeStudents() {

		System.out.println("학생의 수를 입력하세요.");
		int num = this.sc.nextInt();//this 생략가능
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			Student stu = new Student();
			students[i] = stu;
			System.out.println("이름을 입력하세요");
			stu.name = sc.next();
			System.out.println("번호를 입력하세요");
			stu.number = sc.nextInt();
			System.out.println("국어를 입력하세요");
			stu.kor = sc.nextInt();
			System.out.println("영어를 입력하세요");
			stu.eng = sc.nextInt();
			System.out.println("수학 입력하세요");
			stu.math = sc.nextInt();
			stu.makeTotal();

		}
		return students;
		// 학생의 수를 입력받아
		//// 키보드로부터 학생 모두 이름,번호,국어, 영어 수학 입력 받아
		// 학생들의 정보를 리턴.
	}

	public Student makeStudent() {
		// 키보드로부터 이름,번호,국어, 영어 수학 입력 리
		;
		Student stu = new Student();

		System.out.println("이름을 입력하세요");
		stu.name = this.sc.next();
		System.out.println("번호를 입력하세요");
		stu.number = sc.nextInt();
		System.out.println("국어를 입력하세요");
		stu.kor = sc.nextInt();
		System.out.println("영어를 입력하세요");
		stu.eng = sc.nextInt();
		System.out.println("수학 입력하세요");
		stu.math = sc.nextInt();
		student.makeTotal();

		return stu;

	}

}
