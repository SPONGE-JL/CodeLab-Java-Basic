package ch05.object.referenceDataType;

/*
 * 학생 클래스
 */
public class Student {

	int studentId;
	String studentName;

	// 과목에 대한 정보가 학생에 있는 것은 객체단위 개념에서 정의가 모호해진다.
	// 아래 소스를 과목 클래스로 이동한다.

	// int scoreKorea;
	// int scoreMath;
	// int scoreEng;

	Subject subjectKorea;
	Subject subjectMath;
	Subject subjectEng;

	/*
	 * 학생 인스턴스를 생성시 과목 인스턴스를 생성하여 참조할 수 있도록 합니다.
	 */
	public Student(int studentId, String studentName) {

		// this : 자기 자신(클래스) 인스턴스를 지시하는 참조 객체
		this.studentId = studentId;
		this.studentName = studentName;

		// 국어, 영어, 수학 과목 객체
		subjectKorea = new Subject();
		subjectMath = new Subject();
		subjectEng = new Subject();

	}

	/*
	 * 생성한 이후 참조된 객체의 멤버변수에 값을 저장합니다.
	 */
	public void setKoreaScore(int scoreKorea) {
		subjectKorea.score = scoreKorea;
	}

	public void setMathScore(int scoreMath) {
		subjectMath.score = scoreMath;
	}

	public void setEngScore(int scoreEng) {
		subjectEng.score = scoreEng;
	}

}
