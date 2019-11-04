package ch06.array.arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// 의존 패키지 자동 가져오기 : ctrl/command + shift + o

		// JDK에서 구현해 둔 배열 형태의 리스트 자료형 : 순서를 가지고 크기변화가 가능한 자료형태
		ArrayList<String> list = new ArrayList<String>();

		// 리스트에 자료 추가하기
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// 출력하기 1 : 일반 for 문
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

		// 출력하기 2 : 개선된 for 문
		for (String str : list) {
			System.out.println(str);
		}

	}

}
