package ch02.data_type;

/*
 * 상수(constant) : 변하지 않고 고정된 값
 * 리터럴(literal) : 프로그램에서 사용하는 모든 값 (숫자값, 문자갑, 논리값)
 * 
 * 1. 모든 리터럴은 상수 풀(constant pool)에 저장되어 있음
 * 2. 상수풀에 저장될 때, 정수는 int, 실수는 double로 저장
 */
public class Constant_and_Literal {

	public static void main(String[] args) {

		// final : 상수 명시
		final int a = 10;
		// 상수를 특정 타입으로 지정하려 선언과 동시에 초기화 되어야합니다.
		// 상수 풀에서 해당 값을 가지는 이름이 저장되고 변경이 불가합니다.
		
		System.out.println("상수 : " + a);

	}

}
