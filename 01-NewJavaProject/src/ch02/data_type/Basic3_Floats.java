package ch02.data_type;

/*
 * 기본 자료형(원시타입) : 실수
 */
public class Basic3_Floats {

	// 실수의 기본 자료형은 "double"
	// float을 사용하고자 하려면 f,F 식별자를 개별로 붙여줌

	// 부동소수점 방식 : 실수를 십진수로 지수부와 가수부로 표현
	// 0.1 -> 1.0 x 10 ^ -1
	// float (32bit) - 부호비트[1], 지수비트[8], 가수비트[23]
	// double(64bit) - 부호비트[1], 지수비트[11],가수비트[52]

	// 아주 넓은 범위의 실수릂 표현할 수 있는 장점
	// 0을 표현할 수 없음으로 인해서 오차가 발생할 수 있음

	public static void main(String[] args) {

		// 8 byte
		double d = 3.14;
		// 실수 저장의 기본 자료형은 double

		// 4 byte
		float f = 3.14f;
		// 기본 자료형인 double은 float보다 큰 자료형이므로
		// 식별자(f)를 붙여서 작은 자료형(float타입)으로 명시해줌

		System.out.println("double : " +d);
		System.out.println("float : "+f);
		
		/*
		 * 부동소수점의 오류
		 */
		double dNum = 1;
		System.out.println("초기값 dNum = " + dNum); // 1.0

		for (int i = 0; i < 100; i++)
			dNum = dNum + 0.1;
		System.out.println("기대값 dNum = " + 11);
		System.out.println("오차값 dNum = " + dNum); // 10.999999999999979

	}
}
