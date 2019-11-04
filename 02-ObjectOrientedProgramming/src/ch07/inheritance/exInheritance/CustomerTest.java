package ch07.inheritance.exInheritance;

public class CustomerTest {

	public static void main(String[] args) {

		// 일반고객
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;

		System.out.println(customerLee.showCustomerInfo()); // 이순신님의 등급은 SILVER

		// VIP 고객
		VIPCustomer customerKim = new VIPCustomer(20010, "김유신");
		customerKim.bonusPoint = 30000;

		System.out.println(customerKim.showCustomerInfo()); // 김유신님의 등급은 VIP

	}

}
