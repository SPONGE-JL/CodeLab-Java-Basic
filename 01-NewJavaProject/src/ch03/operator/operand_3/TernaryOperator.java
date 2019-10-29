package ch03.operator.operand_3;

/*
 * 삼항 연산자 예시
 */
public class TernaryOperator {

	public static void main(String[] args) {

		int numA = 20;
		int numB = 10;

		// 조건 결과가 참인지 거짓인지에 따라 결과를 분기
		System.out.println((numA > numB) ? 100 : 999); // 100
		System.out.println((numA < numB) ? 'A' : 'B'); // b

	}

}
