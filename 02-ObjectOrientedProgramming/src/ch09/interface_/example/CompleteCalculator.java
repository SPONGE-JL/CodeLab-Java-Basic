package ch09.interface_.example;

/*
 * 추상 클래스를 상속받은 클래스
 */
public class CompleteCalculator extends Calculator {

	// 인터페이스를 구현한 추상클래스를 상속받았으므로
	// 구현되지 않은 클래스만 구현해도 충분함
	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int devide(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		} else {
			return num1 / num2;
		}
	}

	@Override
	public String stringAdd(String s1, String s2) {
		return s1 + s2;
	}

	// 상속 클래스의 일반 메서드
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}

	// 인터페이스의 디펄트 메서드를 재정의할 수 있음
	/*
	@Override
	public void description() {
		System.out.println("재정의 되었습니다.");
	}
	*/

}
