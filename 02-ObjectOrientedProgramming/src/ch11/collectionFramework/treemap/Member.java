package ch11.collectionFramework.treemap;

/*
 * Using commonly in Map package
 */
public class Member {

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

}
