package ch08.abstractClass.example;

/*
 * 추상 클래스 예시
 */
public abstract class Computer {

	// abstract method (추상 메소드) : 구현의 책임을 하위 구현 클래스에 위임한다.
	public abstract void display();

	public abstract void typing();

	// concrete method (구현 메소드) : 추상 클래스도 구현 메소드를 가질 수 있다.
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
