package ch12.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Lyn");
		sList.add("Hoo");
		sList.add("Lan-pang");
		
		Stream<String> stream = sList.stream(); // 스트림 객체 생성
		stream.forEach(s -> System.out.print(s + " ")); // 스트림 최종연산 수행
		// [출력] Lyn Hoo Lan-pang 
		stream.close();// 스트림 객체는 재사용이 불가능함. 스트림 객체 소거
		
		System.out.println();
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		// [출력] Hoo Lan-pang Lyn 
		
		System.out.println();
		sList.stream().filter(s -> "Hoo".equals(s)).forEach(s -> System.out.print(s));
		// [출력] Hoo
		
		System.out.println();
		sList.stream().map(s -> s.length()).forEach(l -> System.out.print(l + " "));
		// [출력] 3 3 8 
		
	}
	
}
