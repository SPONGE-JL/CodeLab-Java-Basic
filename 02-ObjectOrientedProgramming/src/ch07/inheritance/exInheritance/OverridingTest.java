package ch07.inheritance.exInheritance;

/*
 * 오버라이딩 구현 테스트 클래스
 */
public class OverridingTest {

	public static void main(String[] args) {

		// 부모 클래스
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;

		// 자식클래스 : 상속받은 VIP클래스에서 상위 클래스 접근이 가능함을 확인
		Customer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 20000;

		// 상위 클래스로의 묵시적 형변환(Upper Type Casting)
		// 상위 클래 형으로 변수를 선언하고, 하위 클래스 인스턴스를 생성할 수 있다.
		// 하위 클래스는 상위 클래스의 타입을 내포하고 있고, 사우이 클래스로 묵시적 형변환이 된다.
		// 상속관계에서 모든 하위 클래스는 상위 클래스로 묵시적 형변환이 되지만, 그 역은 성립하지 않는다.

		// 자식클래스 : 상속받은 VIP클래스에서 상위 클래스 접근이 가능함을 확인
		VIPCustomer customerChoi = new VIPCustomer(10030, "최영");
		customerChoi.bonusPoint = 20000;

		int priceLee = customerLee.calcPrice(1000);
		int priceKim = customerKim.calcPrice(1000);// 생성한 인스턴스의 가상 메소드가 호출
		int priceChoi = customerChoi.calcPrice(1000);// 생성한 인스턴스의 가상 메소드가 호출

		System.out.println(customerLee.showCustomerInfo() + " - 지불금액 : " + priceLee);
		// 이순신님의 등급은 SILVER - 지불금액 : 1000
		System.out.println(customerKim.showCustomerInfo() + " - 지불금액 : " + priceKim);
		// 김유신님의 등급은 VIP - 지불금액 : 100
		System.out.println(customerChoi.showCustomerInfo() + " - 지불금액 : " + priceChoi);
		// 최영님의 등급은 VIP - 지불금액 : 100

	}

}
