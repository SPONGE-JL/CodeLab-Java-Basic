package ch11.collectionFramework;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		// String 자료형 내부에 java.lang.Comparable이 구현되어있어서 자동으로 순서를 정렬
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		for (String str : treeSet) {
			System.out.println(str);
		}

	}

}
