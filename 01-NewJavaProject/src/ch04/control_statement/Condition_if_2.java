package ch04.control_statement;

/*
 * 조건문 if 예시 2
 */
public class Condition_if_2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		// 위 식과 아래 식은 동일하게 수행된다.
		max = (a > b) ? a : b;
		
		System.out.println(max);

	}

}
