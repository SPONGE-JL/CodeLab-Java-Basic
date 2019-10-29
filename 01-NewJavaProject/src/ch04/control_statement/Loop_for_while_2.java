package ch04.control_statement;

/*
 * 반복문 for 예시 2
 */
public class Loop_for_while_2 {

	public static void main(String[] args) {

		int sum = 0;

		// 초기화식; 조건식; 증감식
		for (int i = 0; i < 11; i++) {
			sum += i;
		}

		System.out.println("1부터 10까지 합 = " + sum); // 55
	}

}