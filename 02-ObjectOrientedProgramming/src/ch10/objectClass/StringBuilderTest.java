package ch10.objectClass;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder strBuilder = new StringBuilder("java");
		System.out.println(strBuilder.toString());
		System.out.println(System.identityHashCode(strBuilder));

		strBuilder.append("android");
		System.out.println(strBuilder.toString());
		System.out.println(System.identityHashCode(strBuilder));
		
		// 동일한 주소값을 가지는 가변형 배열을 가진 자료형 StringBuilder는 단일 스레드에서 효과적인 속도를 발휘한다.
		// 다중 스레드에서는 동기화를 보장받지 못하므로, 다중 스레드에서 문자열 가공을 위한 클래스를 사용해야하는 경우 StringBuffer 클래스를 사용한다.
		// 이떄 동기화 과정을 위한 소폭의 속도저하가 있다.
		// StringBuilder와 StringBuffer 모두 가변형 배열 byte[] char 를 내장한 클래스로 배열을 이어붙인 배열로 데이터를 늘린 뒤에
		// toString() 메소드를 통해 String 클래스로 저장하여 문자열의 가공시 메모리 사용을 효과적으로 해결한다.
		
		/*
			[실행결과]
			java
			1311053135
			javaandroid
			1311053135
		 */
	}
}
