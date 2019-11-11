package ch08.abstractClass.template;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("공중제비를 합니다!!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 고급레벨 ******");
	}

}
