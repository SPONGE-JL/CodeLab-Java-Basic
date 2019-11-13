package ch09.interface_.example2;

public class CustomerTest {

	public static void main(String[] args) {

		// 구현체 클래스 타입으로 초기화
		Customer customer = new Customer();
		customer.sayHello(); // 구현체가 가지는 클래스 내부의 메서드
		customer.buy(); // 구현체가 구현한 인터페이스의 추상 메서드
		customer.sell();// 구현체가 구현한 인터페이스의 추상 메서드
		customer.order();// 구현체가 재정의한 인터페이스의 디펄트 메서드

		// 인터페이스 타입으로 형 변환
		Buy buyer = customer;
		buyer.buy(); // 구현체가 구현한 인터페이스의 추상 메서드
		buyer.order();// 구현체가 재정의한 인터페이스의 디펄트 메서드

		Sell seller = customer;
		seller.sell(); // 구현체가 구현한 인터페이스의 추상 메서드
		seller.order();// 구현체가 재정의한 인터페이스의 디펄트 메서드

		/*
			[출력결과]
			신규 구매자 입장!

			Override >> Customer buy...
			Override >> Customer sell...
			
			default >> 구매 주문
			default >> 판매 주문
			Default Override >> 이 내용은 재정의 되었습니다.
			-------------------------------------------
			Override >> Customer buy...
			
			default >> 구매 주문
			default >> 판매 주문
			Default Override >> 이 내용은 재정의 되었습니다.
			-------------------------------------------
			Override >> Customer sell...
			
			default >> 구매 주문
			default >> 판매 주문
			Default Override >> 이 내용은 재정의 되었습니다.
			-------------------------------------------
		 */
	}

}
