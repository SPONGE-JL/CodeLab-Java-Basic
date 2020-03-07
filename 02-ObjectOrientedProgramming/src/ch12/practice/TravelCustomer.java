package ch12.practice;

public class TravelCustomer {

	private int customerNo;
	private int customerAge;
	private String customerName;
	private int customerCharge;

	// 생성자
	public TravelCustomer(int no, String name, int age, int charge) {
		setCustomerNo(no);
		setCustomerName(name);
		setCustomerAge(age);
		setCustomerCharge(charge);
	}

	@Override
	public String toString() {
		return "[" + customerNo +"] " + customerName + "(" + customerAge + "): " + customerCharge;
	}

	/*
	 * Getter & Setter
	 */
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerCharge() {
		return customerCharge;
	}
	public void setCustomerCharge(int customerCharge) {
		this.customerCharge = customerCharge;
	}

}
