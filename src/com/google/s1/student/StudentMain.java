package com.google.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 호출
		//이름 번호 국어 영어 수학 출력
StudentUtil su=new StudentUtil();

Student student=su.makeStudent();

System.out.println("이름:"+student.name);
System.out.println("번호:"+student.number);
System.out.println("국어점수:"+student.kor);
System.out.println("영어점수:"+student.eng);
System.out.println("수학점수:"+student.math);



Student[] students;
students =su.makeStudents();

for(int i=0;i<students.length;i++) {
	System.out.println(i+"번째 학생의 정보");
System.out.println("이름:"+students[i].name);
System.out.println("번호:"+students[i].number);
System.out.println("국어:"+students[i].kor);
System.out.println("영어:"+students[i].eng);
System.out.println("수학:"+students[i].math);


}
	}

}
