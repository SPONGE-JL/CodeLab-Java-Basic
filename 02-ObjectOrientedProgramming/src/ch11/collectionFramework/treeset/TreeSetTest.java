package ch11.collectionFramework.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		// String 자료형 내부에 java.lang.Comparable이 구현되어있어서 자동으로 순서를 정렬
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("수박");
		treeSet.add("호박");
		treeSet.add("옹박");
		treeSet.add("수박");
		
		// TreeSet : 중복없이 오름차순 정렬
		for (String str : treeSet) {
			System.out.println(str);
		}
		/*
		 	수박
			옹박
			호박
		 */
	}
	
}
