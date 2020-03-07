package ch12.lambda;

//'람다식을 위한 인터페이스'임을 명시
@FunctionalInterface
interface MyMaxNumber {
	// 함수형 인터페이스는 '단 하나의 메서드' 명세만 허용
	int getMaxNumber(int x, int y);
}

public class MyMaxNumberTest {
	public static void main(String[] args) {
		// 람다식 구현
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
		// 람다식 실행
		int result = max.getMaxNumber(3, 5);
		// 출력
		System.out.println("람다식에 3과 5를 넣어서 비교한 결과 = " + result); // 5
	}
}
