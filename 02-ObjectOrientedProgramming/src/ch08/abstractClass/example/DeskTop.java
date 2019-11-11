package ch08.abstractClass.example;

/*
 * 추상 클래스를 상속받은 구현 클래스
 */
public class DeskTop extends Computer {

	// 하위 클래스가 추상클래스가 아닌 구현클래스인 경우 상위 클래스의 모든 메소드를 구현해야함
	@Override
	public void display() {
		System.out.println("데스크톱의 화면을 띄웁니다.");
	}

	@Override
	public void typing() {
		System.out.println("데스크톱에 키를 입력합니다.");
	}

}
