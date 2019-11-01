package ch05.object.solveProblem3;

/*
 * 카드 회사 싱글톤 구현하기
 */
public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance();

		Card myCard = company.createCard();
		Card yourCard = company.createCard();

		System.out.println(myCard.getCardNumber()); // 10001 출력
		System.out.println(yourCard.getCardNumber()); // 10002 출력

	}

}
