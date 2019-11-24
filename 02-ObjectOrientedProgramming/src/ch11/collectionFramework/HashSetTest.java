package ch11.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> curry = new HashSet<String>();
		curry.add("감자");
		curry.add("당근");
		curry.add("강황");
		curry.add("감자"); // Set 자료형은 순서가 없으며 중복을 허용하지 않음

		System.out.println(curry); // [강황, 감자, 당근]

		// Set 자료형에 들어 있는 순서대로 순회하여 반환
		Iterator<String> itr = curry.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
