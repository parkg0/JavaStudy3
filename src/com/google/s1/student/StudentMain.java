package com.google.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 호출
		//이름 번호 국어 영어 수학 출력
StudentUtil su=new StudentUtil();

Student student=new Student();

student=su.makeStudent();
System.out.println("이름:"+student.name);
System.out.println("번호:"+student.number);
System.out.println("국어점수:"+student.kor);
System.out.println("영어점수:"+student.eng);
System.out.println("수학점수:"+student.math);


	}

}
