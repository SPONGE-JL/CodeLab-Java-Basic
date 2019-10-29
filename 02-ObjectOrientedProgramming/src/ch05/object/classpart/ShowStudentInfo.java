package ch05.object.classpart;

/**
 * 학생 정보를 저장하는 객체를 생성하고 출력하 과정을 수행하는 클래스
 */
public class ShowStudentInfo {

	public static void main(String[] args) {

		// 생성자를 이용하여 학생 정보를 담을 객체 생성
		Student studentLee = new Student();

		// 생성한 객체 내부의 전역변수에 값을 저장
		studentLee.studentNo = 10258;
		studentLee.studentName = "이정렬";
		studentLee.studentAddress = "자바-객체반";

		// 생성한 객체 내부의 메소드를 호출하여 출력 수행
		studentLee.showStudentInfo();
		
		/*
		 * [Console]
		 * 이정렬(10258)님은 '자바-객체반'에 소속되어 있습니다.
		 */
		
	}

}
