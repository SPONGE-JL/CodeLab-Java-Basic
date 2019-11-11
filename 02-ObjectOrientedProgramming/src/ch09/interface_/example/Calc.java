package ch09.interface_.example;

/*
 * 인터페이스 예제
 */
public interface Calc {

	// 상수는 이텔릭 볼드체로 표기됩니다.
	double PI = 3.14;
	int ERROR = -999999;

	// 추상메서드 : 인터페이스를 구현하는 구현체 클래스에서 메서드를 구현하도록 강제함
	int plus(int num1, int num2);

	int minus(int num1, int num2);

	int multiple(int num1, int num2);

	int devide(int num1, int num2);

	public String stringAdd(String s1, String s2);
}
