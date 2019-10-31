package ch05.object.solveProblem1;

public class Question2_run {

	public static void main(String[] args) {

		Question2 question = new Question2();

		question.orderNo = 201910300001f;
		question.orderDate = "2019년 10월 30일";
		question.orderUserId = "java8";
		question.orderUserName = "유관순";
		question.orderProductSerial = "JDK180-221";
		question.orderAddress = "서울시 영등포구 여의도동 20번지";

		question.print();

		/*
			주문 번호 : 2.01910305E11
			주문 날짜 : 2019년 10월 30일
			주문 아이디 : java8
			주문 이름 : 유관순
			주문 상품 번호 : JDK180-221
			배송 주소 : 서울시 영등포구 여의도동 20번지
		 */
		
	}

}
