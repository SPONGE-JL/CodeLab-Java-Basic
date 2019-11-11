package ch08.abstractClass.template;

/*
 * 템플릿 메소드를 내장한 추상 클래스를 구현한 클래스
 */
public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행을 시작합니다.");
		System.out.println("자동으로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율 주행을 정지합니다.");
	}

}
