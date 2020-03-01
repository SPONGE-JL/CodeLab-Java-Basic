package ch11.collectionFramework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// 내림차순으로 정렬하도록 재정의
		return s1.compareTo(s2) * (-1);
	}
	
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		
		// String 자료형 내부에 java.lang.Comparable이 구현된 것이 아닌, 재정의된 방식으로 재정렬
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		treeSet.add("수박");
		treeSet.add("호박");
		treeSet.add("옹박");
		treeSet.add("수박");
		
		// TreeSet : 중복없이 내림차순 정렬
		for (String str : treeSet) {
			System.out.println(str);
		}
		/*
			호박
			옹박
		 	수박
		 */
	}
	
}
