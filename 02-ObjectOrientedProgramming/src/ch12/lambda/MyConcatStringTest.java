package ch12.lambda;

//'람다식을 위한 인터페이스'임을 명시
@FunctionalInterface
interface MyConcatString {
	// 함수형 인터페이스는 '단 하나의 메서드' 명세만 허용
	String concatString(String str1, String str2);
}

public class MyConcatStringTest {
	public static void main(String[] args) {
		// 람다식 구현
		MyConcatString conc = (x, y) -> x + " " + y;
		// 람다식 실행
		String result = conc.concatString("Lambda", "in Java");
		// 출력
		System.out.println(result); // Lambda in Java
	}
}
