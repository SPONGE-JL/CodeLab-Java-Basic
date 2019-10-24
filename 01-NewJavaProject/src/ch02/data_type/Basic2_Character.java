package ch02.data_type;

/*
 * 기본 자료형(원시타입) : 문자형
 */
public class Basic2_Character {

	// 문자 세트(Character set)를 인코딩(Encoding)하여 문자를 위한 코드값(숫자값)으로 전환
	// 코드값을 문자 세트로 되돌리려면 디코딩(Decoding)으로 전환
	// 자바는 기본적으로 Unicode를 사용하고, UTF-8을 기본으로 사용

	public static void main(String[] args) {

		char ch = 'A';// 2 byte (16 bits)

		System.out.println(" ch = " + ch); // A
		System.out.println(" (int)ch = " + (int) ch); // 65

		int ich = 65;

		System.out.println("\n ich = " + ich); // 65
		System.out.println(" (char)ich = " + (char) ich); // A

		char hangul_1 = '\uAC00';
		char hangul_2 = '나';
		System.out.println("\n hangul_1 = " + hangul_1); // 가
		System.out.println(" hangul_2 = " + hangul_2); //
	}
}
