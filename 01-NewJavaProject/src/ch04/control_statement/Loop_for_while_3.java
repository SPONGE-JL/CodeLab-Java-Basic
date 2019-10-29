package ch04.control_statement;

/*
 * 반복문 for 예시 3 : 구구단 (중첩반복문)
 */
public class Loop_for_while_3 {

	public static void main(String[] args) {

		int dan = 2;
		int count = 1;

		// 외부 반복문
		for (dan = 2; dan <= 9; dan++) {

			// 내부 반복문
			for (count = 1; count <= 9; count++) {

				System.out.println(dan + " X " + count + " = " + (dan * count));

				// 조건문
				if (count == 9) {

					System.out.println("");

				} // 조건문 끝

			} // 내부 반복문 끝

		} // 외부 반복문 끝

	}

}