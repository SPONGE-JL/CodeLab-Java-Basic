package ch06.array.solveProblem;

public class StudentTest {

	public static void main(String[] args) {

		// 학생 객체 생성 + 읽은 책 등록
		Student studentLee = new Student("Lee");
		studentLee.addBookList("태백산맥1");
		studentLee.addBookList("태백산맥2");

		Student studentKim = new Student("Kim");
		studentKim.addBookList("토지1");
		studentKim.addBookList("토지2");
		studentKim.addBookList("토지3");

		Student studentChoi = new Student("Choi");
		studentChoi.addBookList("해리포터1");
		studentChoi.addBookList("해리포터2");
		studentChoi.addBookList("해리포터3");
		studentChoi.addBookList("해리포터4");
		studentChoi.addBookList("해리포터5");
		studentChoi.addBookList("해리포터6");

		Student studentPark = new Student("Park");

		// 학생결과 출력
		studentLee.printBookList();
		studentKim.printBookList();
		studentChoi.printBookList();
		studentPark.printBookList();
		
		/*
			Lee 학생이 읽은 책은 '태백산맥1' '태백산맥2' 입니다.
			Kim 학생이 읽은 책은 '토지1' '토지2' '토지3' 입니다.
			Choi 학생이 읽은 책은 '해리포터1' '해리포터2' '해리포터3' '해리포터4' '해리포터5' '해리포터6' 입니다.
			Park 학생이 읽은 책은 없습니다.
		 */

	}

}
