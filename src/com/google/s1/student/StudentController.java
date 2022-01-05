package com.google.s1.student;

import java.util.Scanner;

public class StudentController {



	public void start() {
		Student[] students = null;
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView(); // while문 들어오기 전에

		while (flag) {
			System.out.println("1.학생들의 정보 입력"); // util class
			System.out.println("2.학생들의 정보 출력");// view class
			System.out.println("3.학생정보 검색 출력");
			System.out.println("4.프로그램 종료");// 유틸이랑 어디 
			System.out.println("번호를 입력하세요");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				students = su.makeStudents(); // 리턴값을 students에 대
				break;
			case 2:
				if(students != null) {
				sv.viewStudents(students);
				}else {
					sv.viewMessage("학생정보를 먼저 입력하세요.");
				}
				break;
			case 3:
			Student student=su.search(students); //리턴값student
			sv.viewStudent(student);
			System.out.println();
			break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			}
		}
	}
}