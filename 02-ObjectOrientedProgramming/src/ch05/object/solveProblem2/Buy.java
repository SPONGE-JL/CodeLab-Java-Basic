package ch05.object.solveProblem2;

public class Buy {

	int iceAmericano = 4100;
	int iceCaffeLatte = 4600;

	public int anIceAmericano(int budget) {

		int charge = budget - iceAmericano;

		return charge;

	}

	public int anIceCaffeLatte(int budget) {

		int charge = budget - iceCaffeLatte;

		return charge;

	}

}
