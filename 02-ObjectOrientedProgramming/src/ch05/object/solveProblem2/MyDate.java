package ch05.object.solveProblem2;

/*
 * 날짜 유효성 검증 클래스
 */
public class MyDate {

	private int year = 0;
	private int month = 0;
	private int day = 0;

	private boolean isUseable = false;

	public MyDate(int year, int month, int day) {

		setYear(year);
		setMonth(month);
		setDay(day);

	}

	public boolean isValid() {

		// 연도 유효성 체크
		if (year <= 0) {
			isUseable = false;
			// 연도가 유효하지 않으면 월/일 체크하지 않
			return isUseable;
		}

		// 월에 대한 일자 유효성 체크
		switch (month) {
		case 1:
			isUseable = isDayRight(31, day);
			break;
		case 2:
			isUseable = isDayRight((year % 4 == 0) ? 29 : 28, day);
			break;
		case 3:
			isUseable = isDayRight(31, day);
			break;
		case 4:
			isUseable = isDayRight(30, day);
			break;
		case 5:
			isUseable = isDayRight(31, day);
			break;
		case 6:
			isUseable = isDayRight(30, day);
			break;
		case 7:
			isUseable = isDayRight(31, day);
			break;
		case 8:
			isUseable = isDayRight(31, day);
			break;
		case 9:
			isUseable = isDayRight(30, day);
			break;
		case 10:
			isUseable = isDayRight(31, day);
			break;
		case 11:
			isUseable = isDayRight(30, day);
			break;
		case 12:
			isUseable = isDayRight(31, day);
			break;
		// 1월 ~ 12월 범위가 아니면 일자 유효성 체크하지 않음
		default:
			isUseable = false;
		}

		// 모든 유효성 통과
		return isUseable;
	}

	/**
	 * 월에 대한 일자 유효성 체크 모듈 메소드
	 * 
	 * @param standard
	 * @param input
	 * @return
	 */
	public boolean isDayRight(int standard, int input) {

		boolean result = false;

		// 입력값이 0 이상의 정수이고, 기준값보다 작을때 유효함
		if (input > 0 && input <= standard) {
			result = true;
		}

		return result;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
