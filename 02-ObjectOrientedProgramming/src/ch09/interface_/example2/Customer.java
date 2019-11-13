package ch09.interface_.example2;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Override >> Customer sell...");
	}

	@Override
	public void buy() {
		System.out.println("Override >> Customer buy...");
	}

	@Override
	public void order() {
		// 상위 인터페이스의 디펄트 메서드를 사용하는 경우
		System.out.println("");
		Buy.super.order();
		Sell.super.order();
		System.out.println("Default Override >> 이 내용은 재정의 되었습니다.");
		System.out.println("-------------------------------------------");
	}

	public void sayHello() {
		System.out.println("신규 구매자 입장!\n");
	}
}
