package ch04.control_statement;

/*
 * 제어문(조건문, 반복문)에서의 continue 활용 예시
 * continue : 조건문에 따라 만난 continue에 의해 현재 단계의 반복을 중단하고 다음단계로 넘어감
 * (반복문 끝으로 행실행순서를 옮긴 뒤 반복문에 다시 제어권을 넘겨주어 continue 이하의 반복을 수행하지 않음)
 */
public class Use_continue {

	public static void main(String[] args) {

		int sum = 0;
		int num;

		// 반복문 시작
		for (num = 1; sum <= 100; num++) {

			sum += num;

			System.out.print("num = " + num + " / sum = " + sum);

			// 조건문 시작
			if ((num % 2) == 0) {

				System.out.println(" !");

				continue;

			} // 조건문 끝

			// 조건문 시작
			if (sum >= 100) {

				continue;

			} // 조건문 끝

			System.out.println("	> no call continue");

		} // 반복문 끝

		/*
		 * [결과]
		 *	num = 1 / sum = 1	> no call continue
		 *	num = 2 / sum = 3 !
		 *	num = 3 / sum = 6	> no call continue
		 *	num = 4 / sum = 10 !
		 *	num = 5 / sum = 15	> no call continue
		 *	num = 6 / sum = 21 !
		 *	num = 7 / sum = 28	> no call continue
		 *	num = 8 / sum = 36 !
		 *	num = 9 / sum = 45	> no call continue
		 *	num = 10 / sum = 55 !
		 *	num = 11 / sum = 66	> no call continue
		 *	num = 12 / sum = 78 !
		 *	num = 13 / sum = 91	> no call continue
		 *	num = 14 / sum = 105 !
		 */

	}

}