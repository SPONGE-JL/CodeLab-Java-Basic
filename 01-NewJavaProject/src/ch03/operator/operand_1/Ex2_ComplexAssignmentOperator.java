package ch03.operator.operand_1;

/*
 * 단항 연산자 예시 2 : 복합대입연산자 
 */
public class Ex2_ComplexAssignmentOperator {

	public static void main(String[] args) {

		int numA = -5;
		int numB = 10;

		// += : 우항의 현재 값에 좌항의 값만큼을 더하 우항에 대입한다
		numA += 7; // (동일) numA = numA + 7
		System.out.println(numA); // 2

		// -= : 우항의 현재 값에 좌항의 값만큼을 빼고 우항에 대입한다
		numA -= 7; // (동일) numA = numA - 7
		System.out.println(numA); // -5

		// *= : 우항의 현재 값에 좌항의 값만큼을 곱고 우항에 대입한다
		numA *= 6; // (동일) numA = numA * 6
		System.out.println(numA); // -30

		// /= : 우항의 현재 값에 좌항의 값만큼을 나누고 우항에 대입한다
		numA /= 6; // (동일) numA = numA * 6
		System.out.println(numA); // -5

		// /= : 우항의 현재 값에 좌항의 값만큼을 나눈 나머지값을 우항에 대입한다
		numA %= 3; // (동일) numA = numA * 3
		System.out.println(numA); // -2

	}

}
