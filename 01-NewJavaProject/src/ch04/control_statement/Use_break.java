package ch04.control_statement;

/*
 * 제어문(조건문, 반복문)에서의 break 활용 예시
 * break : 가장 가까이에 존재하는 반복문 블럭을 탈출
 */
public class Use_break {

	public static void main(String[] args) {

		int sum = 0;
		int num;

		// 반복문 시작
		for (num = 1; sum <= 100; num++) {

			sum += num;

			System.out.println("num = " + num + " / sum = " + sum);

			// 조건문 시작
			if (sum >= 100) {

				break; // 가장 가까이에 존재하는 반복문 블럭을 탈출

			} // 조건문 끝

		} // 반복문 끝

		System.out.println("--------------------");
		System.out.println("num = " + num + " / sum = " + sum); // 14, 105

	}

}