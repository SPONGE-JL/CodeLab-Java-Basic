package ch09.interface_.solveProblem;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {

		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort \n");

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		scanner.close();
		System.out.println("");
		
		// 인터페이스 타입 선언
		Sort sort = null;
		
		// 구현 메소드 스위치
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
		
		System.out.println("\n" + sort.toString());
		
		/*
			정렬방식을 선택하세요.
			B: BubbleSort
			H: HeapSort
			Q: QuickSort
			
			B // 입력
			
			BubbleSort ASCENDING..
			 ~~~~ logic B ~~~~
			BubbleSort DECENDING..
			 ~~~~ logic B ~~~~
			숫자를 정렬하는 알고리즘입니다.
			
			BubbleSort가 구현되었습니다.
		 */
	}

}
