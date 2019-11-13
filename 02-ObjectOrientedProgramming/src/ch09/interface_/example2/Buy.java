package ch09.interface_.example2;

public interface Buy {

	void buy();

	default void order() {
		System.out.println("default >> 구매 주문");
	}

}
