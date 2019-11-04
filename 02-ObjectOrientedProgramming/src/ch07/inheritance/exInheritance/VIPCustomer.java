package ch07.inheritance.exInheritance;

/*
 * 고객 클래스를 상속받는 VIP고객 클래스
 */
public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;

	public VIPCustomer(int customerID, String customerName) {
		// 상위 클래스를 상속받으면 하위 클래스에서 사용할 수 있음
		super(customerID, customerName);

		// 사용하고자하는 변수의 이름이 하위 클래스에 없는 경우 상위 클래스에서 탐색
		// 상위 클래스에 private가 적용된 경우, 하위클래스에서도 접근할 수 없다.
		// private : 외부 클래스에 private를 적용하고, 하위클래스에 public을 적용
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override // 재정의
	public int calcPrice(int price) {
		bonusPoint += price * bonusPoint;

		// TypeCasting(형변환 double -> int)
		return (int) (price * salesRatio);
	}
}
