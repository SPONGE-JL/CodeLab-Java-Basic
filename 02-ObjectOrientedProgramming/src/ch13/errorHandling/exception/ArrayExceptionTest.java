package ch13.errorHandling.exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		try {
			// 인덱스 길이보다 한칸 더 많이 반복문을 수행
			for (int i = 0; i <= 5 ; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 감지");
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: 5
		}
		System.out.println("프로그램을 정상 종료 합니다.");
		
		/*
			0
			0
			0
			0
			0
			예외 감지
			java.lang.ArrayIndexOutOfBoundsException: 5
			프로그램을 정상 종료 합니다.
		 */
	}
	
}
