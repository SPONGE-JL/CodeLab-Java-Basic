package ch03.operator.operand_2;

/*
 * 이항 연산자 예시 3 : 논리연산자 - 논리연산의 결과를 참,거짓으로 반환
 */
public class Ex3_LogicalOperator {

	public static void main(String[] args) {

		// && (논리곱): 두 결과 모두 참일때만 참, 나머지는 거짓
		System.out.println((5 > 3) && (5 == 4)); // false
		// 1. 좌항의 결과가 참이어야만 우항을 연산함.
		// 2. 좌항의 결과가 거짓인 경우, 우항을 연산하지 않고, 거짓으로 논리연산을 종료함.

		// || (논리합): 두 결과 중 하나라도 참이면 참, 모두 거짓일때 거짓
		System.out.println((5 < 3) || (5 > 4)); // true
		// 1. 좌항의 결과가 거짓인 경우에만 우항을 연산함.
		// 2. 좌항의 결과가 참인 경우, 우항을 연산하지 않고, 참으로 논리연산을 종료함.

		/*
		 * 증감연산자와 함께 논리연산자를 사용하는 경우,
		 * 좌항의 연산결과에 따라서 우항의 연산수행을 하지 않음.
		 * 변수 값의 변화를 오류가 생길 수 있을 여지가 매우 큼 
		 */

		System.out.println("");

		// ! (부정) : 논리값을 반대로 뒤집음
		// 단항연산자 중 논리연산자에 속하여 이곳에서 소개
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

}
