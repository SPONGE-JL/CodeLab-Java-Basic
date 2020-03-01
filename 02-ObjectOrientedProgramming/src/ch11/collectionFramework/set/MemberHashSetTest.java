package ch11.collectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;

import ch11.collectionFramework.common.Member;

public class MemberHashSetTest {

	private HashSet<Member> memHashSet;
	
	// 생성시 해쉬셋 내장
	public MemberHashSetTest() {
		memHashSet = new HashSet<Member>();
	}
	
	// 해쉬셋 추가
	public void addMember(Member member) {
		// Member 클래스의 HashCode()와 equals() 재정의에 의해 중복 제거
		memHashSet.add(member);
	}
	
	// 해쉬셋 제거
	public boolean removeMember(int memberId) {
		// 이터레이터 준비
		Iterator<Member> itr = memHashSet.iterator();
		
		Member member = null;
		while(itr.hasNext()) {
			// 해쉬셋 순차 탐색
			member = itr.next();
			// 일치하면 제거후 true 반환
			if (member.getMemberId() == memberId) {
				memHashSet.remove(member);
				return true;
			}
		}
		
		// 해쉬셋에 일치하는 대상이 없을때 false 반환
		System.out.println("입력된 " + memberId + "는 존재하지 않습니다.");
		return false;
	}
	
	// 해쉬셋 전체 출력
	private void showAllMember() {
		for(Member member : memHashSet) {
			// Member 클래스의 toString() 재정의로 동작됨
			System.out.println(member);
		}
	}
	
	// 테스트
	public static void main(String[] args) {
		
		MemberHashSetTest memberHashSetTest = new MemberHashSetTest();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
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
