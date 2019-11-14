package ch09.interface_.example4;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("자바의 정석 1권");
		bookQueue.enQueue("자바의 정석 2권");
		bookQueue.enQueue("이펙티브 자바");

		// 들어간 순서대로 출력
		System.out.println(bookQueue.deQueue()); // 자바의 정석 1권
		System.out.println(bookQueue.deQueue()); // 자바의 정석 2권
		System.out.println(bookQueue.deQueue()); // 이펙티브 자바

	}

}
