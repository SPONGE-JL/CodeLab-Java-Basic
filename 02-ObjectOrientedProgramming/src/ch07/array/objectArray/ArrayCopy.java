package ch07.array.objectArray;

/*
 * 객체배열과 복사
 */
public class ArrayCopy {

	public static void main(String[] args) {
		
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(arr1, 0, arr2, 1, 3);
		// arr1 0번 인덱스를 시작으로
		// arr2의 1번 인덱스에서 3번 인덱스까지를 복사시킨다.
		// arr2 = {1, 10, 20, 30, 5 } 로 변화됨
		
		for (int i : arr2 ) {
			System.out.println(i);
		}
		
	}
	
}
