package ch05.object.cooperation;

/*
 * 학생이 가진 돈으로 버스도 타고, 지하철도 탈 예정입니다.
 */
public class Student {

	String name;
	int money;

	// 탑승을 구현하는 객체
	Take take;

	// 학생 인스턴스 생성시 이름을 입력
	public Student(String name) {

		// 학생 인스턴스에 기본급 5,000원
		this(5000);
		this.name = name;

		// 탑승을 구현하는 객체 생성
		take = new Take();

	}

	// 오버로딩 + 생성자 내부 호출로 기본급 지급 구현
	public Student(int defaultMoney) {

		// 입력된 기본급을 학생 인스턴스에 초기화
		this.money = defaultMoney;
	}

}
