package ch11.collectionFramework.treemap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import ch11.collectionFramework.common.Member;

class MemberTreeMap {

	private HashMap<Integer, Member> memTreeMap;
	
	public MemberTreeMap() {
		memTreeMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		memTreeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(memTreeMap.containsKey(memberId)) {
			memTreeMap.remove(memberId);
			return true;
		}
		
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		// 키로 순환하도록 키 셋을 이터레이터를 반환시켜서 사용
		Iterator<Integer> itr = memTreeMap.keySet().iterator();
		// 값으로 순환하도록 값 컬렉션을 이터레이터로 반환시켜서 사용
		// memHashMap.values().iterator();
		
		while (itr.hasNext() ) {
			int key = itr.next();
			Member member = memTreeMap.get(key);
			System.out.println(member); // toString 오버라이딩 되어있음
		}
		System.out.println();
	}
}


public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMapTest = new MemberTreeMap();
		
		Member memberYi1 = new Member(300, "Yi");
		Member memberKim = new Member(200, "Kim");
		Member memberLee = new Member(100, "Lee");
		Member memberYi2 = new Member(300, "Yi"); // 중복된 객체
		
		memberTreeMapTest.addMember(memberLee);
		memberTreeMapTest.addMember(memberKim);
		memberTreeMapTest.addMember(memberYi1);
		memberTreeMapTest.addMember(memberYi2); // 중복된 객체
		
		// 키값이 Integer이므로 Comparable이 구현되어있음
		memberTreeMapTest.showAllMember();
		/*
		 	Member [getMemberId()=100, getMemberName()=Lee]
			Member [getMemberId()=200, getMemberName()=Kim]
			Member [getMemberId()=300, getMemberName()=Yi]
		 */
		
		memberTreeMapTest.removeMember(200);

		memberTreeMapTest.showAllMember();
		/*
			Member [getMemberId()=100, getMemberName()=Lee]
			Member [getMemberId()=300, getMemberName()=Yi]
		 */
	}
	
}
