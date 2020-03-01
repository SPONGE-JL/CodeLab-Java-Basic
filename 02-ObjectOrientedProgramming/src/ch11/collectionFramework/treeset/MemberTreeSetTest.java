package ch11.collectionFramework.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import ch11.collectionFramework.common.Member;

public class MemberTreeSetTest {

	private TreeSet<Member> memTreeSet;
	
	// 생성시 트리셋 내장
	public MemberTreeSetTest() {
		memTreeSet = new TreeSet<Member>();
	}
	
	// 트리셋 추가
	public void addMember(Member member) {
		// 숫자가 아닌 Member 객체의 비교를 구현하여 중복체크
		memTreeSet.add(member);
	}
	
	// 트리셋 제거
	public boolean removeMember(int memberId) {
		// 이터레이터 준비
		Iterator<Member> itr = memTreeSet.iterator();
		
		Member member = null;
		while(itr.hasNext()) {
			// 트리셋 순차 탐색
			member = itr.next();
			// 일치하면 제거후 true 반환
			if (member.getMemberId() == memberId) {
				memTreeSet.remove(member);
				return true;
			}
		}
		
		// 트리셋 일치하는 대상이 없을때 false 반환
		System.out.println("입력된 " + memberId + "는 존재하지 않습니다.");
		return false;
	}
	
	// 트리셋 전체 출력
	private void showAllMember() {
		for(Member member : memTreeSet) {
			// Member 클래스의 toString() 재정의로 동작됨
			System.out.println(member);
		}
	}
	
	// 테스트
	public static void main(String[] args) {
		
		// COmparable을 사용하여 비교할때 구문.
		MemberTreeSetTest memberHashSetTest = new MemberTreeSetTest();
		
		// Comparator를 사용하여 비교할때 구문: new Member()를 기준으로 정렬하도록 넘겨주어야함
		// MemberTreeSetTest memberHashSetTest = new MemberTreeSetTest();
		
		Member memberKim = new Member(200, "Kim");
		Member memberLee = new Member(100, "Lee");
		Member memberYi1 = new Member(300, "Yi");
		Member memberYi2 = new Member(300, "Yi"); // 중복된 객체
		
		memberHashSetTest.addMember(memberLee); // 추가
		memberHashSetTest.addMember(memberKim);
		memberHashSetTest.addMember(memberYi1);
		
		memberHashSetTest.showAllMember();
		/*
			Member [getMemberId()=100, getMemberName()=Lee]
			Member [getMemberId()=200, getMemberName()=Kim]
			Member [getMemberId()=300, getMemberName()=Yi]
		 */
		System.out.println();

		memberHashSetTest.removeMember(200); // 제거
		memberHashSetTest.addMember(memberYi2); // 중복 추가 시도
		// Member 클래스의 HashCode()와 equals()메소드에 의해 중복이 추가되지 않음
		
		memberHashSetTest.showAllMember();
		/*
			Member [getMemberId()=100, getMemberName()=Lee]
			Member [getMemberId()=300, getMemberName()=Yi]
		 */
	}
	
}
