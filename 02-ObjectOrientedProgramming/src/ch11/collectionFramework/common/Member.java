package ch11.collectionFramework.common;

import java.util.Comparator;

/*
 * Using commonly in collectionFramework package
 */
public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberId;
	private String memberName;
	
	// constructor
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// Getter & Setter
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return "Member [getMemberId()=" + getMemberId() + ", getMemberName()=" + getMemberName() + "]";
	}

	// 간단한 중복 체크 구현
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		// 타입이 같고, 같은 ID를 가지고 있는지 판단
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}
	
	// TreeSet에서 객체 비교를 위해 구현
	// for Interface Comparable
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);
	}
	// for Interface Comparator
	// 
	@Override
	public int compare(Member member1, Member member2) {
		// member1 : this 역할
		// member2 : 비교 대상
		return (member1.memberId - member2.memberId);
		// 비교대상이 작으면 양수가 반환되므로 오름차순으로 정렬
	}
}
