package ch12.practice;

import java.util.ArrayList;
import java.util.List;

public class Calcurator {

	public static void main(String[] args) {

		TravelCustomer kim = new TravelCustomer(1, "Kim", 33, 100);
		TravelCustomer mim = new TravelCustomer(2, "Min", 25, 100);
		TravelCustomer hyo = new TravelCustomer(3, "Hyo", 12, 50);
		TravelCustomer sung = new TravelCustomer(4, "Sung", 27, 100);
		TravelCustomer goo = new TravelCustomer(5, "Goo", 14, 50);
		TravelCustomer hwang = new TravelCustomer(6, "Hwang", 45, 100);

		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(kim);
		customerList.add(mim);
		customerList.add(hyo);
		customerList.add(sung);
		customerList.add(goo);
		customerList.add(hwang);

		System.out.println("=== 고객 리스트 ===");
		for(TravelCustomer customer : customerList)
			System.out.println(customer.toString());
		
		int totalCharge = customerList.stream()
							.mapToInt(customer -> customer.getCustomerCharge())
							.sum();
		System.out.println(">> 총 여행비용 : " + totalCharge); // 500
		
		System.out.println("\n=== 20세 이상인 고객 리스트");
		customerList.stream()
			.filter(customer -> customer.getCustomerAge() >= 20) // 20세 이상
			.map(customer -> customer.getCustomerName()) // 이름 요소 선택
			.sorted() // 오름차순 정렬
			.forEach(name -> System.out.println(name)); // 출력
		/*
			Hwang
			Kim
			Min
			Sung
		 */
	}
	
}
