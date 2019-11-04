package ch06.array.multiArray;

public class TwoDimension {

	public static void main(String[] args) {

		// 행, 열
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 } };

		System.out.println("행의 개수 : " + arr.length); // 2
		System.out.println("1행의 열 개수 : " + arr[0].length); // 3
		System.out.println("2행의 열 개수 : " + arr[1].length); // 4

		// 행 반복
		for (int[] row : arr) {

			// 열 반복
			for (int col : row) {

				// 반복 수행문
				System.out.println(col);

			} // 열 반복 끝

		} // 행 반복 끝

	}

}
