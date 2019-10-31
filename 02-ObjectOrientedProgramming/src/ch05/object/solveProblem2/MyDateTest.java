package ch05.object.solveProblem2;

/*
 * 날짜의 유혀성을 검증하는 프로그램 실행 클래스
 */
public class MyDateTest {

	public static void main(String[] args) {

		// 검증 대상
		int inputYear = 2019;
		int inputMonth = 10;
		int inputDay = 31;

		System.out.println("검증 연 : " + inputYear);
		System.out.println("검증 월 : " + inputMonth);
		System.out.println("검증 일 : " + inputDay);

		// 날짜 인스턴스
		MyDate myDate = new MyDate(inputYear, inputMonth, inputDay);

		// 날짜 인스턴스 멤버변수의 유효성 체크
		boolean valid = myDate.isValid();

		// 결과 메시지
		String msg = null;
		if (valid) {
			msg = "유효합니다.";
		} else {
			msg = "유효하지 않습니다.";
		}

		System.out.println("검증 결과, 위 날짜는 " + msg);
		// 검증 결과, 위 날짜는 유효합니다.

	}

}
