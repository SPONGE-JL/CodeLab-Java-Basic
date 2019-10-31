package ch05.object.referenceDataType;

/*
 * 학생 인스턴스를 생성하여 과목 정보를 참조하도록 참조 자료형을 사용하는 예시
 */
public class StudentTest {

	public static void main(String[] args) {

		// 인스턴스 생성시, 생성자에 따라 국어, 영어, 수학 객체가 생성됨
		Student studentLee = new Student(10258, "이정렬");

		// 객체의 메소드를 호출하여 수행문(객체가 참조하는 객체의 멤버변수에 메소드가 입력받은 값을 초기화 하는 작업)을 수행
		studentLee.setKoreaScore(90);
		studentLee.setMathScore(100);
		studentLee.setEngScore(85);

		System.out.println("학번 : " + studentLee.studentId); // 학번 : 10258
		System.out.println("이름 : " + studentLee.studentName);// 이름 : 이정렬
		System.out.println("국어 점수 : " + studentLee.subjectKorea.score);// 국어 점수 : 90
		System.out.println("수학 점수 : " + studentLee.subjectMath.score); // 수학 점수 : 100
		System.out.println("영어 점수 : " + studentLee.subjectEng.score); // 영어 점수 : 85
	}

}
