package ch04.control_statement;

/*
 * 조건문 예시 1
 */
public class Condition_if_1 {

	public static void main(String[] args) {

		char gender = 'F';

		// 조건문의 수행부는 들여쓰기를 하여 가독성을 높입니다.
		// 수행부가 한 줄의 statement인 경우, braket({,})이 없어도 가능합니다.
		// 그러나 일관된 가독성을 추가합니다.
		if (gender == 'F') {
			System.out.println("여성입니다.");
		}
		// 각 조건은 베타적입니다.
		else if (gender == 'M') {
			System.out.println("남성입니다.");
		}
		// 모든 조건이 해당되지 않으면 수행되는 부분입니다.
		else {
			System.out.println("알 수 없습니다.");
		}

	}

}
