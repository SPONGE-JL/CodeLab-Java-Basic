package ch05.object.function;

/*
 * 생성자 예시
 */
public class Constructor {

	String paramStr = null;
	int paramNum = 0;

	/*
	 * Default Constructor (기본 생성자) - 입력없이 객체를 생성할 때 수행하는 함수
	 */
	public Constructor() {
		// 입력없이(null) 생성될 때 수행되는 수행문
	}

	/*
	 * Over loading (오버로딩) : 같은 이름의 다른 입력(순서,개수) 또는 다른 출력(다른 타입)을 구현하는 방법
	 */

	public Constructor(String inputStr) {
		// 입력으로 문자열을 받으면서 생성될 때 수행되는 수행문
	}

	/*
	 * 아래 2개의 생성자는 같은 종류의 입력을 받지만, 수행이 다른 서로 다른 생성자 입니다.
	 */
	public Constructor(String inputStr, int inputInt) {
		// 문자열, 정수를 입력받을 때 수행되는 수행문
	}

	public Constructor(int inputInt, String inputStr) {
		// 정수, 문자열을 입력받을 때 수행되는 수행문
	}

}
