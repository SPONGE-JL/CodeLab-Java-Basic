package ch12.lambda;

public class MyConcatStringTest {
	
	public static void main(String[] args) {
		
		// 람다식을 구현
		MyConcatString conc = (x, y) -> x + " " + y;
	
		// 실행
		String result = conc.concatString("Lambda", "in Java");
		
		System.out.println(result); // Lambda in Java
	}
}
