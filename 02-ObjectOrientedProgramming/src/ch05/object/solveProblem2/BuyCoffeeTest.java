package ch05.object.solveProblem2;

public class BuyCoffeeTest {

	public static void main(String[] args) {

		// 주문자 객체
		Buyier kim = new Buyier("김 졸려", 10000);

		// 잔고 확인
		int kimCharge = kim.money;
		System.out.println(kim.name + "님의 잔고 : " + kim.money); // 10,000 원

		// 커피 주문
		kimCharge = kim.buy.anIceAmericano(kimCharge);
		kim.money = kimCharge;

		System.out.println(kim.name + "님이 별다방에서 아이스 아메리카노를 사마셨습니다.");
		System.out.println(kim.name + "님의 잔고 : " + kim.money); // 5,900 원

		// 이 졸려 생성
		Buyier lee = new Buyier("이 졸려", 5000);

		// 김 졸려 -> 이 졸려 5,000원 빌려줌
		System.out.println(kim.name + "님이 " + lee.name + "에게 5000원을 빌려 줌");
		kimCharge -= 5000;
		kim.money = kimCharge;
		System.out.println(kim.name + "님의 잔고 : " + kim.money); // 900 원
		System.out.println(lee.name + "님의 잔고 : " + lee.money); // 5,000 원

		// 커피주문
		int leeCharge = lee.money;
		leeCharge = kim.buy.anIceCaffeLatte(leeCharge);
		lee.money = leeCharge;

		System.out.println(lee.name + "님이 별다방에서 아이스 아메리카노를 사마셨습니다.");
		System.out.println(lee.name + "님의 잔고 : " + lee.money); // 400원

	}
}
