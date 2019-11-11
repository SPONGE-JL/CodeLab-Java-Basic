package ch08.abstractClass.template;

public class PlayerTest {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);

		player.upgradeLevel(new AdvancedLevel());
		player.play(2);

		player.upgradeLevel(new SuperLevel());
		player.play(3);
		
		/*
			****** 초급레벨 ******
			천천히 달립니다.
			점프는 못해요!
			공중제비도 못해요!
			****** 중급레벨 ******
			빠르게 달립니다.
			점프 합니다.
			점프 합니다.
			공중제비는 못해요!
			****** 고급레벨 ******
			엄청 빠르게 달립니다.
			아주 높이 점프 합니다.
			아주 높이 점프 합니다.
			아주 높이 점프 합니다.
			공중제비를 합니다!!
		 */
	}

}
