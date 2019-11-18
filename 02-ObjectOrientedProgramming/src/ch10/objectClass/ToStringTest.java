package ch10.objectClass;

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		// 참조형 자료형 String은 "패키지.클래스@메모리 주소"에 대해 toString()을 호출하도록 이미 지정됨
		String str = new String("토지");
		System.out.println(str.toString());

		// java.lang.Object 클래스의 toString()을 재정의하여 사용
		Book book = new Book("토지", "박경리");
		System.out.println(book.toString());

		// 메모리 복제
		Book book2 = (Book) book.clone();
		System.out.println(book2);
	}

}

class Book implements Cloneable {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 마우스 우클릭 > Source >Override/Implements Method
	@Override
	public String toString() {
		return title + " / " + author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// 인스턴스가 힙메모리에서 해제될때 수행되는 메서드로, 직접 호출하는 메서드가 아님
		super.finalize();
	}
}
