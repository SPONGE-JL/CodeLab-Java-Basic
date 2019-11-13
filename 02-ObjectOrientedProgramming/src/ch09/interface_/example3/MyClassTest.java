package ch09.interface_.example3;

public class MyClassTest {

	public static void main(String[] args) {

		// 인터페이스 타입으로 초기화하는 것과
		// 구현체 클래스 타입으로 초기화하는 것은 다르지만,
		// 구현부가 재정의한 내용이 없으므로 아래 결과는 동일하다.

		MyInterface myclass = new MyClass();
		// 상위 인터페이스가 다중 상속받은 인터페이스의 추상메서드를 구현함
		myclass.x();
		myclass.y();

	}

}
