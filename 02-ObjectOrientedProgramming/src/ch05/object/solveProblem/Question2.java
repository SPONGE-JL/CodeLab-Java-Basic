package ch05.object.solveProblem;

public class Question2 {

	float orderNo;
	String orderDate;
	String orderUserId;
	String orderUserName;
	String orderProductSerial;
	String orderAddress;

	public void print() {

		System.out.println("주문 번호 : " + orderNo);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 아이디 : " + orderUserId);
		System.out.println("주문 이름 : " + orderUserName);
		System.out.println("주문 상품 번호 : " + orderProductSerial);
		System.out.println("배송 주소 : " + orderAddress);

	}
}
