package com.google.s1.student;

public class StudentView {
	// 출력 전용 (콘솔에 출력. 데이터를 만들진않고 가지고 온걸 출력)

	// viewStudent - 학생의 모든 정보를 출력
	public void viewStudent(Student st) {
		System.out.println("이름:" + st.name);
		System.out.println("번호:" + st.number);
		System.out.println("국어점수:" + st.kor);
		System.out.println("영어점수:" + st.eng);
		System.out.println("수학점수:" + st.math);
	}

	// view students- 여러명의 학생의 모든정보를출력
	public void viewStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("이름:" + students[i].name);
			System.out.println("번호:" + students[i].number);
			System.out.println("국어점수:" + students[i].kor);
			System.out.println("영어점수:" + students[i].eng);
			System.out.println("수학점수:" + students[i].math);
		}
	}

	public void viewMessage(String message) {

		// 문자열 출력
		System.out.println("---------------------");
		System.out.println(message); // 메세지가 없음 받아와야돼
		System.out.println("---------------------");
	}

}
