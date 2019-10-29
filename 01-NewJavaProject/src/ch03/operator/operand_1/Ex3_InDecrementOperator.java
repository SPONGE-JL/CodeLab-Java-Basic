package ch03.operator.operand_1;

/*
 * 단항 연산자 예시 3 : 증감연산자 + 전위/후위
 */
public class Ex3_InDecrementOperator {

	public static void main(String[] args) {

		int num = 10;

		// ++ : 해당 값에 1을 더한다. 이때 변수에 저장된 값 자체를 변경된다.
		System.out.println(num); // 10
		System.out.println(++num);// 11 (전위:연산전 증가)
		System.out.println(num); // 11
		System.out.println(num++);// 11 (후위:연산이후 증가)
		System.out.println(num); // 12

		System.out.println("");

		// -- : 해당 값에 1을 뺀다. 이때 변수에 저장된 값 자체가 변경된다.
		System.out.println(num); // 12
		System.out.println(--num);// 11 (전위:연산전 감소)
		System.out.println(num); // 11
		System.out.println(num--);// 11 (후위:연산전 감소)
		System.out.println(num); // 10

	}

}
