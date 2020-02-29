package ch10.objectClass;

public class StringClass {

	public static void main(String[] args) {

		// 인스턴스로 생성되어 문자열을 힙 메모리에 생성
		String str1 = new String("abc");
		String str2 = new String("abc");
		// 상수풀에 있는 문자열을 가리킴
		String str3 = "abc";
		String str4 = "abc";

		// 서로 다른 힙 메모리 주소값
		System.out.println("str1 == str2 : " + (str1 == str2)); // false
		// 힙메모리 주소값과 상수풀의 주소값은 서로 다름
		System.out.println("str1 == str3 : " + (str1 == str3)); // false
		// 동일한 힙 메모리 주소값
		System.out.println("str3 == str4 : " + (str3 == str4)); // true

	}
}
