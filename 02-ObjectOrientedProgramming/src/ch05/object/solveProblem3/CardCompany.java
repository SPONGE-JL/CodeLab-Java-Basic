package ch05.object.solveProblem3;

public class CardCompany {

	// 싱글톤 객체
	private static CardCompany singletonCardCompany = new CardCompany();

	private Card card;

	// 생성불가
	private CardCompany() {

	}

	// 싱글톤 객체 반환
	public static CardCompany getInstance() {

		return singletonCardCompany;

	}

	// 싱글톤이 생성하는 참조 객체
	public Card createCard() {

		card = new Card();

		return card;
	}

}
