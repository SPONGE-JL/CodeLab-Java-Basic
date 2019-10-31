package ch05.object.cooperation;

public class Take {

	// 요금정보
	int chargeBlueBus = 1050;
	int chargeGreenSubway = 1800;

	// 버스 탑승 후 잔액정보 반환
	public int aBlueBus(int money) {

		int resultMoney = money - chargeBlueBus;
		return resultMoney;

	}

	// 지하철 탑승 후 잔액정보 반환
	public int aGreeneBus(int money) {

		int resultMoney = money - chargeGreenSubway;
		return resultMoney;

	}

}
