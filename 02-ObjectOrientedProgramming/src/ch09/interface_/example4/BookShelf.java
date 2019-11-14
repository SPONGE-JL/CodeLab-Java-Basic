package ch09.interface_.example4;

/*
 * 이미 존재하는 클래스를 단일 상속받고, 인터페이스를 (다중)구현하는 코드
 */
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// 대기열 중에서 제일 앞의 자료(List)을 제거하고 반환
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
