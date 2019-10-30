package ch05.object.function;

public class FunctionTest {

	/**
	 * 파라미터로 2개의 int타입을 순서대로 받고, int를 리턴하는 함수
	 * 
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public static int addNum(int num1, int num2) {

		int result;
		result = num1 + num2;

		return result;
	}

	/**
	 * 파라미터로 1개의 문자열을 받고, 리턴이 없는 함수(void)
	 * 
	 * @param greeting
	 */
	public static void sayHello(String greeting) {

		System.out.println(greeting);

	}

	/**
	 * 파라미터 없이 int타입을 리턴하는 함수
	 * 
	 * @return
	 */
	public static int calcSum() {

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += 1;
		}

		return sum;
	}

	/**
	 * main 함수를 실행할 때, 선언해둔 함수 들을 호출하여야 실제로 수행됨.
	 */
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;

		int total = addNum(n1, n2);
		System.out.println(total); // 30

		sayHello("안녕하세요."); // 안녕하세요.

		int n3 = calcSum();
		System.out.println(n3); // 101

	}

}
