package ch05.object.solveProblem3;

public class Card {

	private static int serialNum = 100000;

	private int proviedNum;

	public Card() {

		setCardNum(++serialNum);

	}

	private void setCardNum(int cardNum) {

		this.proviedNum = cardNum;

	}

	public int getCardNumber() {

		return this.proviedNum;
	}

}
