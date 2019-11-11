package ch08.abstractClass.template;

/*
 * 템플릿 메소드를 내장한 추상 클래스를 구현한 클래스
 */
public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전하는 차량입니다.");
		System.out.println("핸들을 조작하여 직접 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟고 정지합니다.");
	}

}
