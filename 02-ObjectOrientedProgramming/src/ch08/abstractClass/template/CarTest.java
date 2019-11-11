package ch08.abstractClass.template;

/*
 * 구현 클래스가 동일한 시나리오를 가지고 템플릿 패턴을 가지는 것을 테스트하는 클래스
 */
public class CarTest {

	public static void main(String[] args) {

		Car aiCar = new AICar();
		Car manualCar = new ManualCar();

		// 정해진 흐름(시나리오)대로 실행하는 메서드
		aiCar.run();
		manualCar.run();
		/*
			차량이 시동됩니다.
			자율 주행을 시작합니다.
			자동으로 방향을 전환합니다.
			자율 주행을 정지합니다.
			차량의 시동을 종료합니다..
			
			차량이 시동됩니다.
			사람이 운전하는 차량입니다.
			핸들을 조작하여 직접 운전합니다.
			브레이크를 밟고 정지합니다.
			차량의 시동을 종료합니다..
		 */
	}
}
