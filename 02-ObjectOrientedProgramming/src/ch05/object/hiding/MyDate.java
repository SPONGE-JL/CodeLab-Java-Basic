package ch05.object.hiding;

/*
 * 접근제어자 예시
 */
public class MyDate {

	// public
	// 클래스 외부까지 모든 접근 허용

	// private
	// 클래스 내부에서의 접근 허용
	// 정보 은닉 구현가능

	// protected
	// 상속받은 상위클래스를 하위클래스에서만 접근가능하도록 허용

	// (명시하지않음, default)
	// 같은 패키지 내부에서만 접근할 수 있는 상태 (서로 다른 패키지에서는 접근 불가)

	int day;
	int month;
	int year;

	// 다른 클래스에서 이 클래스의 인스턴스를 생성했다고해서 멤버변수를 직접 초기화하는 것을 방지
	private int privNum;

	// private로 지정된 변수를 클래스 내부에서 초기화하는 기능을 제공하는 public 메소드
	public void setPrivNum(int privNum) {
		this.privNum = privNum;
	}

	// private로 지정된 변수를 클래스 내부에서 리턴해주는 기능을 제공하는 public 메소드
	public int getPrivNum() {
		return privNum;
	}

}
