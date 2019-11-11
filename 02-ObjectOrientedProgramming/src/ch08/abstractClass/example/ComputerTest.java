package ch08.abstractClass.example;

public class ComputerTest {

	public static void main(String[] args) {

		// 추상 클래스는 인스턴스로 생성이 불가능하다.
		// Computer computer = new Computer();

		// 추상 클래스 타입으로 구현 클래스를 인스턴스 생성
		Computer comDesk = new DeskTop();
		Computer comLap = new LapTop();

		// 추상클래스의 메소드
		comDesk.turnOn(); // 전원을 켭니다.
		comDesk.turnOff();// 전원을 끕니다.
		// 구현클래스가 구현한 메소드
		comDesk.display();// 데스크톱의 화면을 띄웁니다.
		comDesk.typing(); // 데스크톱에 키를 입력합니다.

		System.out.println("");

		// 추상 클래스의 메소드를 재정의한 메소드
		comLap.turnOn(); // 노트북의 전원을 켭니다.
		comLap.turnOff();// 노트북의 전원을 끕니다.
		// 구현 클래스가 구현한 메소드
		comLap.display();// 노트북의 화면을 띄웁니다.
		comLap.typing(); // 노트북에 키를 입력합니다.
	}

}
