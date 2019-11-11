package ch08.abstractClass.template;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프는 못해요!");
	}

	@Override
	public void turn() {
		System.out.println("공중제비도 못해요!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초급레벨 ******");
	}

}
