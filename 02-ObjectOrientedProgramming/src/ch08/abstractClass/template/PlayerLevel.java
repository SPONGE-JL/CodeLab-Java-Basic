package ch08.abstractClass.template;

/*
 * 템플릿 메서드 패턴을 활용한 객체지향 예제
 */
public abstract class PlayerLevel {

	// 구현체 클래스에서 구현을 강제할 추상메서드
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	// 구현체 클래스의 재정의를 금지할 고정메서드
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
