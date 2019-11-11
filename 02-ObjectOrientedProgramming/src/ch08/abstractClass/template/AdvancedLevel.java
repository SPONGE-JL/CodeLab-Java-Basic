package ch08.abstractClass.template;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("공중제비는 못해요!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 중급레벨 ******");
	}

}
