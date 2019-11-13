package ch09.interface_.example2;

public interface Sell {

	void sell();

	default void order() {
		System.out.println("default >> 판매 주문");
	}
}
