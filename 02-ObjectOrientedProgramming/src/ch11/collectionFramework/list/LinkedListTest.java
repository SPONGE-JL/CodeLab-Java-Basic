package ch11.collectionFramework.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> lnList = new LinkedList<String>();
		
		// 마지막에 추가
		lnList.add("A");
		lnList.add("B");
		System.out.println(lnList); // [A, B]
		lnList.add("C");
		System.out.println(lnList); // [A, B, C]
		
		// 마지막을 지정하여 제거
		lnList.removeLast();
		System.out.println(lnList); // [A, B]
		
		// 탐색
		for(int i = 0; i < lnList.size(); i++) {
			System.out.println(lnList.get(i));
		}
		/*
		 	A
			B
		 */
	}
}
