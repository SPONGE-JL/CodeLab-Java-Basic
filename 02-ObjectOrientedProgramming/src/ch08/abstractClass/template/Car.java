package ch08.abstractClass.template;

/*
 * 템플릿 메소드를 내장한 추상 클래스
 */
public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public void turnOnCar() {
		System.out.println("차량이 시동됩니다.");
	}

	public void turnOffCar() {
		System.out.println("차량의 시동을 종료합니다..");
	}

	// 아래 시나리오는 재정의 되어선 안되는 시나리오를 가질 경우,
	// Template Method(템플릿 메소드)로 정의한다.
	final public void run() {
		turnOnCar();
		drive();
		stop();
		turnOffCar();
		System.out.println("");
	}
}
