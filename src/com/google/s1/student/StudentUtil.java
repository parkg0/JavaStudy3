package com.google.s1.student;

import java.util.Scanner;

public class StudentUtil {
	//학생을 생성하고 정보를 입력받는 
	
	public void search(Student[] students) {
		Scanner sc= new Scanner(System.in);
		System.out.println("학생의 번호를 입력하세요");
		int num= sc.nextInt();
		for(int i=0; i<students.length;i++) {
			if(num==students[i].number) {
				System.out.println("이름:" + students[i].name);
				System.out.println("번호:" + students[i].number);
				System.out.println("국어점수:" + students[i].kor);
				System.out.println("영어점수:" + students[i].eng);
				System.out.println("수학점수:" + students[i].math);
			}
			
		}
		//1.	학생의 번ㅇ호입력 -스캐너
		//2. 모든학생을 검사했는가? -모든학생은 메인에 있음.받아와
		// 1)맞으면 종료
		// 2)아니면 3번으로 이동
		//3.학생한명을 불러서 번호가 같은가?
		// 1)같으면 해당 학생을 출력하기 
		// 2)아니면 2번으로 이동 
		
		//검색할 학생의 번호를 입력 받아
		//입력받는 번호와 일치하는 학생을 찾아서
		//리턴
	}

	public  Student[] makeStudents() {
		Scanner sc= new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요.");
		int num= sc.nextInt();
		Student[] students=new Student[num];
		
		for(int i=0;i<students.length;i++) {
			Student stu=new Student();
			students[i]=stu;
			System.out.println("이름을 입력하세요");
			stu.name=sc.next();
			System.out.println("번호를 입력하세요");
			stu.number = sc.nextInt();
			System.out.println("국어를 입력하세요");
			stu.kor = sc.nextInt();
			System.out.println("영어를 입력하세요");
			stu.eng = sc.nextInt();
			System.out.println("수학 입력하세요");
			stu.math = sc.nextInt();
			
			
		}
		return students;
		// 학생의 수를 입력받아
		//// 키보드로부터 학생 모두 이름,번호,국어, 영어 수학 입력 받아
		// 학생들의 정보를 리턴.
	}

	public Student makeStudent() {
		// 키보드로부터 이름,번호,국어, 영어 수학 입력 리
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();

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

		return stu;

	}

}
