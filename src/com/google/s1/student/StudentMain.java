package com.google.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		StudentController sc= new StudentController();
		sc.start();
//		// 1.Main Method 역할
//		// 1)start 와 초기화
//		// 2)test
//		StudentUtil su = new StudentUtil();
//		StudentView sv = new StudentView();
//		// sv에 담아 힙에다가 스튜던트뷰타입 만들고 시작점의 주소를 .
//
//		Student stu = new Student();
//		stu.name = "춘식이";
//		stu.number = 1;
//		stu.kor = 40;
//		stu.eng = 20;
//		stu.math = 90;
//
//		Student stu2 = new Student();
//		stu2.name = "춘순이";
//		stu2.number = 2;
//		stu2.kor = 30;
//		stu2.eng = 40;
//		stu2.math = 70;
//
//		Student[] students = new Student[2];
//		students[0] = stu;
//		students[1] = stu2;
//
//		
//	Student student2 =su.search(students);
//	System.out.println(student2.name);
//	
//	if(student2 != null) {
//		System.out.println(student2.name);
//	}else {
//		
//		System.out.println("학생 없음");
//	}
//		System.out.println("종료");
////		sv.viewStudents(Students);
////		System.out.println("-------------------");
////		sv.viewStudent(stu);
////		System.out.println("-------------------");
////		String msg = "Hello";
////		sv.viewMessage(msg);
////		System.out.println("-------------------");
//		
	}

}
