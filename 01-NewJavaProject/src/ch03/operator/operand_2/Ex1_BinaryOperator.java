package ch03.operator.operand_2;

/*
 * 이항 연산자 예시 1 : 대입연산자 및 산술연산자
 */
public class Ex1_BinaryOperator {

	public static void main(String[] args) {

		// = : 우항의 값을 좌항에 저장(대입)
		int numA = 20;
		int numB = 10;

		System.out.println(numA + numB); // 30
		System.out.println(numA - numB); // 10
		System.out.println(numA * numB); // 200
		System.out.println(numA / numB); // 2 (나눗셈의 몫)
		System.out.println(numA % numB); // 0 (나눗셈의 나머지)

		// 문자열이 있는 경우 숫자값이 아닌 문자열로 인식하여 사용
		System.out.println("Plus" + numA + numB); // Plus2010

	}

}
