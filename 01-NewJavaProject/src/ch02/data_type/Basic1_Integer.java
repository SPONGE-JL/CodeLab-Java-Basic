package ch02.data_type;

/*
 * 기본 자료형 (원시타입) : 정수형 
 */
public class Basic1_Integer {

	byte b = -128;
	// 크기 : 1 byte = 8 bit
	// 범위 : 8비트 자리중 최상위 자리는 부호비트로 제외, -2^7 ~ 2^7-1 의 범위를 표현

	short s = -32768;
	// 크기 : 2 byte = 16 bit
	// 범위 : 16비트 자리중 최상위 자리는 부호비트로 제외, -2^15 ~ 2^15-1 의 범위를 표현

	// 가장 많이 사용하는 정수자료
	int i = -2147483648; // 21억 4748만 3648
	// 크기 : 4 byte = 32 bit
	// 범위 : 32비트 자리중 최상위 자리는 부호비트로 제외, -2^31 ~ 2^31-1 의 범위를 표현

	// 4바이트를 초과하는 정수를 저장하는 자료형
	long l = -9223372036854775808L; // 922경 3372조 386억 5477만 5808
	// 크기 : 8 byte = 64 bit
	// 범위 : 64비트 자리중 최상위 자리는 부호비트로 제외, -2^63 ~ 2^63-1 의 범위를 표현

	public static void main(String[] args) {

		System.out.println("byte min : " + Byte.MIN_VALUE);
		System.out.println("byte min : " + Byte.MAX_VALUE);
		// byte min : -128
		// byte min : 127

		System.out.println("short min : " + Short.MIN_VALUE);
		System.out.println("short min : " + Short.MAX_VALUE);
		// short min : -32768
		// short min : 32767

		System.out.println("int min : " + Integer.MIN_VALUE);
		System.out.println("int min : " + Integer.MAX_VALUE);
		// int min : -2147483648
		// int min : 2147483647

		System.out.println("long min : " + Long.MIN_VALUE);
		System.out.println("long min : " + Long.MAX_VALUE);
		// long min : -9223372036854775808
		// long min : 9223372036854775807

	}
}
