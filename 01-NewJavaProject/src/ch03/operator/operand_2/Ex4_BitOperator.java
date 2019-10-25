package ch03.operator.operand_2;

/*
 * 이항 연산자 예시 4 : 비트연산자
 */
public class Ex4_BitOperator {

	public static void main(String[] args) {

		// 1의 보수 : 2진수의 관점에서, 0을 1로, 1을 0으로 바꾼 수
		// 2의 보수 : 1의 보수로 나온 값에 1을 더한 수

		// ~ : 비트의 반전
		byte b = ~0;
		System.out.println(b); // -1

		// 0000 0000 : 0
		// 1111 1111 : (0에 대한 1의 보수)
		// 0000 0000 : 0 (1의 보수에 1을 더한 값)

		// 0000 1010 : 10를 2진수로 표현
		// 1111 0101 : 비트 전환된 값 (1의 보수)
		// 1111 0110 :
		//

	}

}
