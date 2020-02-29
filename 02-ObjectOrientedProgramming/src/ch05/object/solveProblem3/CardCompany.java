package ch05.object.solveProblem3;

public class CardCompany {

	// 싱글톤 객체 (단 하나의 카드회사)
	private static CardCompany singletonCardCompany = new CardCompany();

	// 여러개의 카드
	private Card card;

	// 추가생성불가
	private CardCompany() {}


	// 싱글톤 객체 반환
	public static CardCompany getInstance() {
		
		return singletonCardCompany;
	}
	
	// 싱글톤에서 생성되는 카드 객체 (호출시 회사에 귀속된 새로운 카드를 생성 후 반환)
	public Card createCard() {

		card = new Card();
		return card;
	}
}
