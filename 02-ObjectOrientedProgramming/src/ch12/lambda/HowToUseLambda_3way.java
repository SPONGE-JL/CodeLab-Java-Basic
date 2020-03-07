package ch12.lambda;


public class HowToUseLambda_3way {
	
	// [공통:선언] 인터페이스로 람다식의 이름, 입력과 출력 선언
	private interface PrintString {
		void showString(String str);
	}

	// [방법2] 상위 콜스택에서 입력받은 구현된 람다식에 매개변수 입력
	private static void showMyString(PrintString lambdaStr) {
		lambdaStr.showString("Test2");
	}
	
	// [방법3] 상위 콜스택에서 메소드 호출시 람다식을 구현하여 반환
	private static PrintString returnString() {
		return s -> System.out.println(s + "~!");
	}
	
	public static void main(String[] args) {
		// [방법1,2] 람다식 구현
		PrintString lambdaStr = str -> System.out.println(str);
		// [방법1 : 동일 콜스택에서 구현한 람다식에 매개변수 입력]
		lambdaStr.showString("Test1"); // [출력] Test1
		// [방법2 : 동일 콜스택에서 구현한 람다식을 하위 콜스택에 전달]
		showMyString(lambdaStr); // [출력] Test2
		
		// [방법3: 하위 콜스택에서 구현된 람다식을 상위  콜스택에서 반환받고 매개변수 입력]
		PrintString lambdaStr2 = returnString();
		lambdaStr2.showString("Test3"); // [출력] Test3~!
	}
}
