package com.google.s1.student;

public class StudentView {
	// 출력 전용 (콘솔에 출력. 데이터를 만들진않고 가지고 온걸 출력)

	// viewStudent - 학생의 모든 정보를 출력
	public void view(Student st) {
		System.out.println("이름:" + st.name);
		System.out.println("번호:" + st.number);
		System.out.println("국어점수:" + st.kor);
		System.out.println("영어점수:" + st.eng);
		System.out.println("수학점수:" + st.math);
		System.out.println("총점:"+st.total);
		System.out.println("평균:"+st.avg);
	}

	// view students- 여러명의 학생의 모든정보를출력
	public void view(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			this.view(students[i]);
		}
	}

	public void view(String message) {

		// 문자열 출력
		System.out.println("---------------------");
		System.out.println(message); // 메세지가 없음 받아와야돼
		System.out.println("---------------------");
	}

}
