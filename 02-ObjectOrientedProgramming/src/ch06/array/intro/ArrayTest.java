package ch06.array.intro;

/*
 * 자바의 배열
 */
public class ArrayTest {

	public static void main(String[] args) {

		/*
		 * 배열 : 순서를 가지고 동일한 타입의 자료를 저장하는 자료 구조 
		 * - 확정된 길이로 생성되는 방식 (fixed length)으로 물리적인 위치와 논리적인 위치가 동일하다.
		 * - 연속된 자료구조로, 비어있는 값을 허용하지 않는다.
		 * - 중간에 값을 끼워넣기 위해서는 기존 값을 다음칸으로 복사한 뒤에 넣고자 하는 값을 덧씌워야함
		 * - 첨자연산을 지원하므로 속도가 매우 빠르고, 배열의 인덱스(index)가 0부터 시작한다.
		 */
		
		// 배열을 선언하는 방법 : 배열도 객체이므로 방의 크기를 결정하여 new로 생성한다.
		int[] arrA = new int[10]; // 자료형을 명시하고 이름을 두는 방식으로 선언하는 방식을 권장 
		int arrB[] = new int[10]; // 이 방법으로도 선언이 된다.
		
		// 선언과 동시에 초기화를 하는 방식
		int[] arrC = new int[] {1,2,3}; // 선언과 동시에 초기화 하는 경우 방 크기는 생략된다.
		int[] arrD = {4,5,6,7}; // 이 방법이 가장 많이 사용된다.
		
		// 반복문으로 배열의 인덱스로 호출하여 출력하는 예시
		for(int i = 0 ; i < arrC.length ; i++) {
			System.out.println("- " + arrC[i]);
		}
		
		// 반복문으로 인덱스로 호출된 방에 저장된 값을 교환하여 출력하는 예시
		for(int i = 0, num = 1 ; i < arrC.length ; i++, num ++) {
			arrC[i] += num;
			System.out.println("> " + arrC[i]);
		}
		
	}
	
}
