package ch08.abstractClass.example;

/*
 * 추상 클래스를 상속받은 구현 클래스
 */
public class LapTop extends Computer {

	@Override
	public void display() {
		System.out.println("노트북의 화면을 띄웁니다.");

	}

	@Override
	public void typing() {
		System.out.println("노트북에 키를 입력합니다.");
	}

	// 상위 클래스의 구현 메소드를 재정의 할 수 있습니다.
	@Override
	public void turnOn() {
		System.out.println("노트북의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북의 전원을 끕니다.");
	}
}
