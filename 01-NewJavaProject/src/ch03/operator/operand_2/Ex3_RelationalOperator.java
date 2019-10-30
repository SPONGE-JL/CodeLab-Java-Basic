package ch03.operator.operand_2;

/*
 * 이항 연산자 예시 2 : 관계연산자 - 비교한 결과를 참,거짓으로 반환
 */
public class Ex3_RelationalOperator {

	public static void main(String[] args) {

		int numA = 20;
		int numB = 10;

		System.out.println(numA > numB); // true
		System.out.println(numA >= numB);// false
		System.out.println(numA < numB); // false
		System.out.println(numA <= numB);// true
		System.out.println(numA == numB);// false
		System.out.println(numA != numB);// true

	}

}
