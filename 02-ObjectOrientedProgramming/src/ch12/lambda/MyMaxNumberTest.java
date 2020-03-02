package ch12.lambda;

public class MyMaxNumberTest {
	
	public static void main(String[] args) {
		
		// 람다식을 구현
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
	
		// 실행
		int result = max.getMaxNumber(3, 5);
		
		System.out.println("람다식에 3과 5를 넣어서 비교한 결과 = " + result); // 5
	}
}
