package ch09.interface_.solveProblem;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {

		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		Sort sort = null;

		switch (inputString) {
		case "B":
			sort = new BubbleSort();
			break;
		case "H":
			sort = new HeapSort();
			break;
		case "Q":
			sort = new QuickSort();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 종료합니다.");
		}
		
		System.out.println(sort.toString());
		scanner.close();
	}

}
