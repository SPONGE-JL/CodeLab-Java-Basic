package ch11.collectionFramework.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import ch11.collectionFramework.common.Member;

class MemberHashMap {

	private HashMap<Integer, Member> memHashMap;
	
	public MemberHashMap() {
		memHashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		memHashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(memHashMap.containsKey(memberId)) {
			memHashMap.remove(memberId);
			return true;
		}
		
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		// 키로 순환하도록 키 셋을 이터레이터를 반환시켜서 사용
		Iterator<Integer> itr = memHashMap.keySet().iterator();
		// 값으로 순환하도록 값 컬렉션을 이터레이터로 반환시켜서 사용
		// memHashMap.values().iterator();
		
		while (itr.hasNext() ) {
			int key = itr.next();
			Member member = memHashMap.get(key);
			System.out.println(member); // toString 오버라이딩 되어있음
		}
		System.out.println();
	}
}


public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMapTest = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberYi1 = new Member(300, "Yi");
		Member memberYi2 = new Member(300, "Yi"); // 중복된 객체
		
		memberHashMapTest.addMember(memberLee);
		memberHashMapTest.addMember(memberKim);
		memberHashMapTest.addMember(memberYi1);
		memberHashMapTest.addMember(memberYi2);
		
		memberHashMapTest.showAllMember();
		/*
		 	Member [getMemberId()=100, getMemberName()=Lee]
			Member [getMemberId()=200, getMemberName()=Kim]
			Member [getMemberId()=300, getMemberName()=Yi]
		 */
		
		memberHashMapTest.removeMember(200);

		memberHashMapTest.showAllMember();
		/*
			Member [getMemberId()=100, getMemberName()=Lee]
			Member [getMemberId()=300, getMemberName()=Yi]
		 */
	}
	
}
