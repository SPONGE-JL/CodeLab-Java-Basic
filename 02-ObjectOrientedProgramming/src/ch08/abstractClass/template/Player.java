package ch08.abstractClass.template;

public class Player {

	// 다형성을 활용한 객체지향 프로그래밍
	PlayerLevel playerLevel;

	public Player() {
		playerLevel = new BeginnerLevel();
		playerLevel.showLevelMessage();
	}

	public PlayerLevel getLelvel() {
		return playerLevel;
	}

	public void upgradeLevel(PlayerLevel playerLevel) {
		this.playerLevel = playerLevel;
		playerLevel.showLevelMessage();
	}

	// 추상 클래스의 템플릿 메서드를 호출하는 메소드
	public void play(int count) {
		playerLevel.go(count);
	}

}
