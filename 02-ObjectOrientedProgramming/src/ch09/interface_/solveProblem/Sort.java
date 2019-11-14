package ch09.interface_.solveProblem;

public interface Sort {

	void ascending(int[] intArray);

	void decending(int[] intArray);

	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	};

	default void commonCall() {
		ascending(null);
		decending(null);
		description();
	}

}
