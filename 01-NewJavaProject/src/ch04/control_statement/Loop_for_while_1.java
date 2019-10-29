package ch04.control_statement;

/*
 * 반복문 for 예시 1
 */
public class Loop_for_while_1 {

	public static void main(String[] args) {

		int a = 0;

		for (;;) { // 무한반복
			a += 1;
			if (a == 10) {
				break;
			}
		}

		while (a < 20) {
			a += 1;
		}

		do {
			a += 1;
		} while (a < 30);
	}

}
