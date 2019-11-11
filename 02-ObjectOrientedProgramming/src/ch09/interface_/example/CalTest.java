package ch09.interface_.example;

/*
 * 인터페이스 / 추상클래스 / 상속클래스 테스트 예제
 */
public class CalTest {

	public static void main(String[] args) {

		CompleteCalculator calc = new CompleteCalculator();
		int n1 = 10;
		int n2 = 2;

		System.out.println(calc.plus(n1, n2));
		System.out.println(calc.minus(n1, n2));
		System.out.println(calc.multiple(n1, n2));
		System.out.println(calc.devide(n1, n2));

		// CompleteCalculator 타입으로 선언했기 때문에 사용가능
		// 만약 Calc(인터페이스) 타입으로 선언했다면 오류가 발생함 (다운캐스팅이 필요)
		calc.showInfo();

	}

}
