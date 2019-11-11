package ch09.interface_.example;

/*
 * 인터페이스를 구현한 추상클래스
 */
public abstract class Calculator implements Calc {

	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	// 나머지 추상메서드를 구현하지 않았으므로
	// 이 클래스는 인터페이스를 구현한 추상클래스입니다.

}
