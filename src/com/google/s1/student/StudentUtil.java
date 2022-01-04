package com.google.s1.student;

import java.util.Scanner;

public class StudentUtil {
	public Student makeStudent() {
		//키보드로부터 이름,번호,국어, 영어 수학 입력 리
Scanner sc=new Scanner(System.in);
Student stu= new Student();

System.out.println("이름을 입력하세요");
stu.name=sc.next();
System.out.println("번호를 입력하세요");
stu.number=sc.nextInt();
System.out.println("국어를 입력하세요");
stu.kor=sc.nextInt();
System.out.println("영어를 입력하세요");
stu.eng=sc.nextInt();
System.out.println("수학 입력하세요");
stu.math=sc.nextInt();

return stu;


	}

}
