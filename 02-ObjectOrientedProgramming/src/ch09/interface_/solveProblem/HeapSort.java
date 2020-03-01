package ch09.interface_.solveProblem;

public class HeapSort extends AbsSort {

	@Override
	public void ascending(int[] intArray) {
		System.out.println("HeapSort ASCENDING..");
		System.out.println(" ~~~~ logic H ~~~~");
	}

	@Override
	public void decending(int[] intArray) {
		System.out.println("HeapSort DECENDING..");
		System.out.println(" ~~~~ logic H ~~~~");
	}

	@Override
	public String toString() {
		return "HeapSort가 구현되었습니다.";
	}
}
