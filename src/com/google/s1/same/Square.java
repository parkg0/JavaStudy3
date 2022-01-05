package com.google.s1.same;

public class Square {

	int garo;
	int sero;

	public boolean same(Square s) {
		boolean check;
		if (this.garo == s.garo && this.sero == s.sero) {
			check = true;
		} else {
			check = false;
		}
		return (check);

		// 멤버변수 garo랑 매개변수로 받은 객체 garo가 같고
		// 멤버변스 sero랑 매개변수로 받은 객체의 sero 같으면 true 리턴
		// 한개라도 다르면 false return

	}

}
