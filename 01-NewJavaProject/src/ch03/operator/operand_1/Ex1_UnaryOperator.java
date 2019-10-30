package ch03.operator.operand_1;

/*
 * 단항 연산자 예시 1 :부호연산자
 */
public class Ex1_UnaryOperator {

	public static void main(String[] args) {

		int numA = -5;
		int numB = 10;

		// + : 해당 값 그대로 전달
		System.out.println(+numA);// -5
		System.out.println(+numB);// 10

		// - : 해당 값의 부호를 반대로 교환
		System.out.println(-numA);// 5
		System.out.println(-numB);// -10

		// 부호연산자는 변수에 저장된 값에 영향 없이 호출된 값에만 적용됨
		System.out.println(numA); // -5
		System.out.println(numB); // -10

	}

}
