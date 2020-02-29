package ch06.array.intro;

/*
 * 문자배열을 생성하고 출력하는 문제입니다. 대문자 A-Z까지 배열에 저장하고 이를 다시 출력하는 프로그램을 만들어보세요.
 */
public class ArrayCharTest {

	public static void main(String[] args) {
		
		// 문자배열
		char[] alphabet = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		// 일반 for문
		for (int i = 0 ; i < alphabet.length ; i ++ ) {
			System.out.println(i + " : " + alphabet[i]);
		}
		// 결과
		/*
			1 : B
			2 : C
			3 : D
			4 : E
			5 : F
			6 : G
			7 : H
			8 : I
			9 : J
			10 : K
			11 : L
			12 : M
			13 : N
			14 : O
			15 : P
			16 : Q
			17 : R
			18 : S
			19 : T
			20 : U
			21 : V
			22 : W
			23 : X
			24 : Y
			25 : Z
		*/
		
		// 개선된 for문
		for (char c : alphabet) {
			System.out.print(c + " ");
		}
		// 결과
		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	}
	
}
