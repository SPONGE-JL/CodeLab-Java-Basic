package ch12.lambda;


public class TestLambda {

	public static void main(String[] args) {
		
		// 람다식 선언 (방법 1,2)
		PrintString lambdaStr = str -> System.out.println(str);
		
		// [방법1 : 매개변수 전달]
		// 람다식을 변수로 정의해두고, 람다식에 매개변수 전달
		lambdaStr.showString("Test1");
		// >> Test1
		
		// [방법2 : 람다식 전달]
		// 람다식을 변수로 정의해두고, 메서드에 람다식을 전달한뒤, 메서드에서 매개변수를 람다식에 전달
		showMyString(lambdaStr);
		// >> Test2
		
		// [방법3 : 람다식 반환]
		// 메서드가 람다식을 정의해두고, 메서드를 호출하여 람다식에 매개변수 전달
		PrintString lambdaStr2 = returnString();
		lambdaStr2.showString("Test3");
		// >> Test3~!
		
	}
	
	// 인터페이스로 람다식의 이름, 입력과 출력 정의 (정의이므로 방법 1,2,3 공통)
	private interface PrintString {
		void showString(String str);
	}

	// 람다식을 전달받고 매개변수를 람다식에 전달 (방법2)
	private static void showMyString(PrintString lambdaStr) {
		lambdaStr.showString("Test2");
	}
	
	// 람다식을 정의한 메서드를 호출할 때 마다 동일한 람다식을 반환 (방법3)
	private static PrintString returnString() {
		return s -> System.out.println(s + "~!");
	}
	
}
