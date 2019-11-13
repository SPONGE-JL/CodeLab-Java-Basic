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

	// 디펄트 메서드 : 인터페이스를 구현하는 구현체 클래스에서 공통으로 사용할 메서드를 기본적으로 구현하는 메서드. 구현체에서 재정의 가능
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}

	// 정적 메서드 : 인터페이스 타입으로 정의한 스태틱메서드로 인스턴스생성없이 사용하는 메서드
	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += i;
		}

		return total;
	}

}
