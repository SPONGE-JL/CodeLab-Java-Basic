package ch12.stream;

import java.util.Arrays;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] intArr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(intArr).sum();
		System.out.println(sum); // 15
		
		int count = (int) Arrays.stream(intArr).count();
		System.out.println(count); // 5
		
		int reduceSum = Arrays.stream(intArr).reduce(0, (prev, now) -> prev + now);
		System.out.println(reduceSum); // 15
	}
	
}
