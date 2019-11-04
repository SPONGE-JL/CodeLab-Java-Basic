package ch07.inheritance.exInheritance;

/*
 * 고객 클래스 : 부모 클래스
 */
public class Customer {

	// 상위 클래스에 private가 적용된 경우, 하위클래스에서도 접근할 수 없다.
	// private : 외부 클래스에 private를 적용하고, 하위클래스에 public을 적용
	protected int customerID;
	protected String customerName;
	protected String customerGrade;

	int bonusPoint;
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public Customer(int customerID, String customerName) {
		this();
		setCustomerID(customerID);
		setCustomerName(customerName);
	}

	// 비용 계산시 보너스포인트를 추가하는 함수
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
